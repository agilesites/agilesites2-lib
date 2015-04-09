package wcs.java.model.definition.loader;

import wcs.api.Arg;
import wcs.api.Log;
import wcs.java.model.*;
import wcs.java.model.annotation.StartMenu;
import wcs.java.model.annotation.StartMenuArgument;
import wcs.java.model.annotation.StartMenuItem;
import wcs.java.model.definition.WCSDefinition;
import wcs.java.model.type.attribute.WCSAttributeType;
import wcs.java.util.IdBeautifier;
import wcs.java.util.StringUtils;
import wcs.java.util.Util;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static wcs.Api.getLog;

/**
 * Abstract Strategy Pattern, used for defining whether it should be a asset attribute/definition
 * or page attribute/definition.
 *
 * Current strategies are:
 * AssetDefinitionLoader
 * PageDefinitionLoader
 */
public abstract class DefinitionLoader {
    final static Log log = getLog(DefinitionLoader.class);

    protected Class<? extends WCSDefinition>[] classList;

    protected static Map<String, AttributeEnum> editors = new HashMap<String, AttributeEnum>();

    public DefinitionLoader(String site) {
        this.classList = (Class<? extends WCSDefinition>[]) Util.classesFromResource(site, "definitions.txt");
    }

    public static void addEditor(AttributeEnum editorType) {
        editors.put(editorType.getDescription(),editorType);
    }

    abstract public void saveAttributes(AttributeModelBase modelBase);

    abstract public void saveDefinitions(DefinitionModelBase modelBase);

    abstract public void saveParentDefinitions(DefinitionModelBase modelBase);


    public void saveStartMenus(StartMenuModelBase modelbase) {
        initialize();
        for(Class<? extends WCSDefinition> clazz : classList) {
            if (clazz.isAnnotationPresent(StartMenu.class)) {
                StartMenu a = clazz.getAnnotation(StartMenu.class);
                for (StartMenuItem startMenu : a.items()) {
                    DefinitionContainer dc =
                            new DefinitionContainer(IdBeautifier.generateUniqueStartMenuId(StringUtils.capitalize(startMenu.name())),
                                    startMenu.name(),
                                    // description = name
                                    startMenu.name(),
                                    startMenu.assetType());
                    List<Arg> args = new ArrayList<Arg>();
                    for (StartMenuArgument startMenuArgument : startMenu.args()) {
                        Arg arg = new Arg(startMenuArgument.name(), startMenuArgument.value());
                        args.add(arg);
                    }
                    modelbase.startMenu(startMenu.type().toString(),dc,clazz.getSimpleName(),args.toArray(new Arg[]{}));

                }
            }
        }
    }

    abstract protected void initialize();

    /**
     * Get Attribute type via reflection.
     * @param f
     * @return
     */
    protected WCSAttributeType getWCSAttributeType(Field f)  {
        WCSAttributeType attrType = null;
        ParameterizedType xType = (ParameterizedType) f.getGenericType();
        Class<?> classType = (Class<?>) xType.getActualTypeArguments()[0];
        try {
            attrType = (WCSAttributeType) classType.newInstance();
        } catch (InstantiationException e) {
            log.error("Could not instantiate WCSAttributeType", e);
        } catch (IllegalAccessException e) {
            log.error("Could not access WCSAttributeType", e);
        }
        return attrType;
    }
}
