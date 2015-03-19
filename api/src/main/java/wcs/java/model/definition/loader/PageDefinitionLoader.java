package wcs.java.model.definition.loader;

import wcs.java.model.*;
import wcs.java.model.annotation.*;
import wcs.java.model.definition.WCSDefinition;
import wcs.java.model.type.WCSAttributeType;
import wcs.java.util.IdBeautifier;
import wcs.java.util.StringUtils;
import wcs.java.util.Util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

public class PageDefinitionLoader extends DefinitionLoader {

    private  Map<Class<? extends WCSDefinition>, Set<DefinitionContainer>> defMap;

    public PageDefinitionLoader(String site) {
        super(site);
        initialize();
    }

    /**
     * Save Attributes used for Page Definitions.
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
                AttributeEnum editorName = null;
                String assetTypeName = null;
                for(Annotation a : f.getAnnotations()) {
                    if(a.annotationType() == PageAssetAttribute.class) {
                        PageAssetAttribute xAttr = (PageAssetAttribute) a;
                        attrDesc = (xAttr.value() != null ? xAttr.value() : f.getName());
                        type = getWCSAttributeType(f);
                    }
                    if(a.annotationType() == Multiple.class) mul = Attribute.Mul.MULTIPLE;
                    if(a.annotationType() == Editor.class) {
                        Editor editor = (Editor) a;
                        editorName = editors.get(editor.value());
                    }
                    if(a.annotationType() == AssetType.class) {
                        AssetType assetType = (AssetType) a;
                        assetTypeName = assetType.value();
                    }
                }
                // If type hasn't been specified, we don't know which type to create, continue to next field
                if(type == null) continue;
                DefinitionContainer dc =
                        new DefinitionContainer(IdBeautifier.generateUniquePageAttrId(StringUtils.capitalize(f.getName())),
                                StringUtils.capitalize(f.getName()),
                                attrDesc,
                                type.getAttributeName(),
                                mul,
                                editorName,
                                assetTypeName);
                defList.add(dc);
            }
        }
        for(DefinitionContainer dc : defList) {
            // TODO Add another method for only supplying dc object, so it doesn't have to be specified 3 times.
            Attribute a = modelBase.attribute(dc.getType().toString(), dc, dc.getMul(), true, true);
            // Set AssetType is set
            if(dc.getAssetType() != null) a.setAssetType(dc.getAssetType().toString());
            // Add editor if set
            if(dc.getEditor() != null) a.setEditor(dc.getEditor());
        }
    }

    /**
     * Save Page Definitions.
     * @param modelBase
     */
    @Override
    public void saveDefinitions(DefinitionModelBase modelBase) {
        initialize();
        for(Map.Entry<Class<? extends WCSDefinition>, Set<DefinitionContainer>> dc : defMap.entrySet()) {
            ContentDefinition cDef = null;
            PageDefinition assetDefinition;
            String description;
            for(Annotation a : dc.getKey().getAnnotations()) {
                if(a.annotationType() == PageDefinition.class) {
                    assetDefinition = (PageDefinition) a;
                    description = (assetDefinition.value() != null ? assetDefinition.value() : dc.getKey().getSimpleName());
                    // Add asset definition
                    cDef = modelBase.contentDef(new DefinitionContainer(IdBeautifier.generateUniquePageDefId(dc.getKey().getSimpleName()), dc.getKey().getSimpleName(), description));
                }
            }
            if(cDef != null) {
                for(Field f : dc.getKey().getDeclaredFields()) {
                    boolean isRequired = false;
                    PageAssetAttribute assetAttribute = null;
                    for (Annotation fieldAnnotation : f.getAnnotations()) {
                        if(fieldAnnotation.annotationType() == Required.class) isRequired = true;
                        if(fieldAnnotation.annotationType() == PageAssetAttribute.class) {
                            assetAttribute = (PageAssetAttribute) fieldAnnotation;
                        }
                    }
                    if(assetAttribute != null) {
                        cDef.addAttribute(IdBeautifier.generateUniquePageAttrId(StringUtils.capitalize(f.getName())), isRequired);
                    }
                }
            }
        }
    }

    /**
     * It's not possible to save parent definitions for pages yet.
     * @param modelBase
     */
    @Override
    public void saveParentDefinitions(DefinitionModelBase modelBase) {
        // Not implemented
    }

    /**
     * Initialize maps
     */
    @Override
    protected void initialize() {
        defMap = new LinkedHashMap<Class<? extends WCSDefinition>, Set<DefinitionContainer>>();
        for(Class<? extends WCSDefinition> clazz : classList) {
            Set<DefinitionContainer> definitionContainerSet = new LinkedHashSet<DefinitionContainer>();
            processPageFieldsFromSet(definitionContainerSet, clazz);
            defMap.put(clazz, definitionContainerSet);
        }
    }

    /**
     * Find annotated WCS attributes, and add them to the HashSet of the specified model class.
     * @param defList
     * @param clazz
     */
    private void processPageFieldsFromSet(Set<DefinitionContainer> defList, Class clazz) {
        // Run through fields
        for(Field f : clazz.getDeclaredFields()) {
            // Loop through field attributes
            Attribute.Mul mul = Attribute.Mul.SINGLE;
            WCSAttributeType attrType = null;
            String attrDesc = null;
            for(Annotation a : f.getAnnotations()) {
                if(a.annotationType() == PageAssetAttribute.class) {
                    PageAssetAttribute xAttr = (PageAssetAttribute) a;
                    attrDesc = (xAttr.value() != null ? xAttr.value() : f.getName());
                    log.debug("DESC: " + attrDesc);
                    attrType = getWCSAttributeType(f);
                }
                if(a.annotationType() == Multiple.class) mul = Attribute.Mul.MULTIPLE;

            }
            // If type hasn't been specified, we don't know which type to create, continue to next field
            if(attrType == null) continue;
            DefinitionContainer dc = new DefinitionContainer(IdBeautifier.generateUniquePageAttrId(StringUtils.capitalize(f.getName())),
                    StringUtils.capitalize(f.getName()),
                    attrDesc,
                    attrType.getAttributeName(),
                    mul);
            defList.add(dc);
        }
    }


}
