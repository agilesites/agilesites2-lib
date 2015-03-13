package wcs.java.model.definition.loader;

import wcs.api.Log;
import wcs.java.model.*;
import wcs.java.model.annotation.*;
import wcs.java.model.annotation.ParentDefinition;
import wcs.java.model.definition.WCSDefinition;
import wcs.java.model.enums.Constants;
import wcs.java.model.type.WCSAttributeType;
import wcs.java.util.IdBeautifier;
import wcs.java.util.NamingUtil;
import wcs.java.util.StringUtils;
import wcs.java.util.Util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

import static wcs.Api.getLog;

public class AssetDefinitionLoader extends DefinitionLoader {
    final static Log log = getLog(AssetDefinitionLoader.class);
    private Map<Class<? extends WCSDefinition>, Set<DefinitionContainer>> defMap = new LinkedHashMap<>();

    public AssetDefinitionLoader(String site) {
        super(site);
        initialize();
    }

    /**
     * Save attributes which are being used by assets.
     * @param modelBase
     */
    @Override
    public void saveAttributes(AttributeModelBase modelBase) {
        initialize();
        HashSet<DefinitionContainer> defList = new LinkedHashSet<DefinitionContainer>();
        for(Class<? extends WCSDefinition> clazz : classList) {
            for(Field f : clazz.getDeclaredFields()) {
                // Loop through field attributes
                Attribute.Mul mul = Attribute.Mul.SINGLE;
                WCSAttributeType type = null;
                String attrDesc = null;
                String assetTypeName = null;
                AttributeEnum editorName = null;
                for(Annotation a : f.getAnnotations()) {
                    if(a.annotationType() == AssetAttribute.class) {
                        AssetAttribute xAttr = (AssetAttribute) a;
                        attrDesc = (xAttr.value() != null ? xAttr.value() : f.getName());
                        type = getWCSAttributeType(f);
                    }
                    if(a.annotationType() == Multiple.class) mul = Attribute.Mul.MULTIPLE;
                    if(a.annotationType() == Editor.class) {
                        Editor editor = (Editor) a;
                        editorName = new EditorAttribute(editor.description(),editor.name());
                    }
                    if(a.annotationType() == AssetType.class) {
                        AssetType assetType = (AssetType) a;
                        assetTypeName = assetType.value();
                    }
                }
                // If type hasn't been specified, we don't know which type to create, continue to next field
                if(type == null) continue;
                DefinitionContainer dc =
                        new DefinitionContainer(IdBeautifier.generateUniqueAttrId(StringUtils.capitalize(f.getName())),
                                StringUtils.capitalize(f.getName()),
                                attrDesc,
                                type.getAttributeName(),
                                mul,
                                editorName, assetTypeName);
                defList.add(dc);
            }
        }
        for(DefinitionContainer dc : defList) {
            // TODO Add another method for only supplying dc object, so it doesn't have to be specified 3 times.
            Attribute a = modelBase.attribute(dc.getType().toString(), dc, dc.getMul(), true, true);
            // Set AssetType is set
            if(dc.getAssetType() != null) a.setAssetType(dc.getAssetType().toString());
            // Set Editor if set
            if(dc.getEditor() != null) a.setEditor(dc.getEditor());
        }

    }

    /**
     * Save all parent definition models, annotated with {@link wcs.java.model.annotation.ParentDefinition}
     * @param modelBase
     */
    public void saveParentDefinitions(DefinitionModelBase modelBase) {
        initialize();
        for(Map.Entry<Class<? extends WCSDefinition>, Set<DefinitionContainer>> dc : defMap.entrySet()) {
            for(Annotation a : dc.getKey().getAnnotations()) {
                if(a.annotationType() == ParentDefinition.class) {
                    ParentDefinition parentDefinition = (ParentDefinition) a;
                    String description = (parentDefinition.value() != null ? parentDefinition.value() : dc.getKey().getSimpleName());
                    // Add parent definition
                    wcs.java.model.ParentDefinition pDef = modelBase.parentDef(
                            new DefinitionContainer(IdBeautifier.generateUniqueDefId(dc.getKey().getSimpleName()),
                                    dc.getKey().getSimpleName(),
                                    description));
                    for(Field f : dc.getKey().getDeclaredFields()) {
                        boolean isRequired = false;
                        String attrDesc = null;
                        for (Annotation fieldAnnotation : f.getAnnotations()) {
                            if(fieldAnnotation.annotationType() == Required.class) isRequired = true;
                            if(fieldAnnotation.annotationType() == AssetAttribute.class) {
                                AssetAttribute assetAttribute = (AssetAttribute) fieldAnnotation;
                                attrDesc = (assetAttribute.value() != null ? assetAttribute.value() : f.getName());
                            }
                        }
                        if(attrDesc != null) {
                            pDef.addAttribute(IdBeautifier.generateUniqueDefId(StringUtils.capitalize(f.getName())), isRequired);
                        }
                    }
                }
            }
        }
    }

    /**
     * Save asset definitions.
     * @param modelBase
     */
    @Override
    public void saveDefinitions(DefinitionModelBase modelBase) {
        initialize();
        String description;
        for(Map.Entry<Class<? extends WCSDefinition>, Set<DefinitionContainer>> dc : defMap.entrySet()) {
            ContentDefinition cDef = null;
            AssetDefinition assetDefinition;
            Parent parentLink = null;
            for(Annotation a : dc.getKey().getAnnotations()) {
                if(a.annotationType() == AssetDefinition.class) {
                    assetDefinition = (AssetDefinition) a;
                    description = (assetDefinition.value() != null ? assetDefinition.value() : dc.getKey().getSimpleName());
                    // Add asset definition
                    cDef = modelBase.contentDef(new DefinitionContainer(IdBeautifier.generateUniqueDefId(dc.getKey().getSimpleName()), dc.getKey().getSimpleName(), description));
                }
                if(a.annotationType() == Parent.class) parentLink = (Parent) a;
            }
            if(cDef != null) {
                // Does this definition have a parent?
                if(parentLink != null) {
                    cDef.addParent(IdBeautifier.generateUniqueDefId(parentLink.value().getSimpleName()), parentLink.required(), parentLink.multiple());
                }
                for(Field f : dc.getKey().getDeclaredFields()) {
                    boolean isRequired = false;
                    AssetAttribute assetAttribute = null;
                    for (Annotation fieldAnnotation : f.getAnnotations()) {
                        if(fieldAnnotation.annotationType() == Required.class) isRequired = true;
                        if(fieldAnnotation.annotationType() == AssetAttribute.class) {
                            assetAttribute = (AssetAttribute) fieldAnnotation;
                        }
                    }
                    if(assetAttribute != null) {
                        cDef.addAttribute(IdBeautifier.generateUniqueAttrId(StringUtils.capitalize(f.getName())), isRequired);
                    }
                }
            }
        }
    }

    /**
     * Initialize Class, DefinitionContainer map.
     */
    @Override
    protected void initialize() {
        defMap = new LinkedHashMap<>();
        for(Class<? extends WCSDefinition> clazz : classList) {
            Set<DefinitionContainer> definitionContainerSet = new LinkedHashSet<>();
            processFieldsFromSet(definitionContainerSet, clazz);
            defMap.put(clazz, definitionContainerSet);
        }
    }
    /**
     * Find annotated WCS attributes, and add them to the HashSet of the specified model class.
     * @param defList
     * @param clazz
     */
    private void processFieldsFromSet(Set<DefinitionContainer> defList, Class clazz) {
        // Run through fields
        for(Field f : clazz.getDeclaredFields()) {
            // Loop through field attributes
            Attribute.Mul mul = Attribute.Mul.SINGLE;
            WCSAttributeType attrType = null;
            String attrDesc = null;
            for(Annotation a : f.getAnnotations()) {
                if(a.annotationType() == AssetAttribute.class) {
                    AssetAttribute xAttr = (AssetAttribute) a;
                    attrDesc = (xAttr.value() != null ? xAttr.value() : f.getName());
                    log.debug("DESC: " + attrDesc);
                    attrType = getWCSAttributeType(f);
                }
                if(a.annotationType() == Multiple.class) mul = Attribute.Mul.MULTIPLE;

            }
            // If type hasn't been specified, we don't know which type to create, continue to next field
            if(attrType == null) continue;
            DefinitionContainer dc = new DefinitionContainer(IdBeautifier.generateUniqueAttrId(StringUtils.capitalize(f.getName())), StringUtils.capitalize(f.getName()), attrDesc, attrType.getAttributeName(), mul);
            defList.add(dc);
        }
    }
}