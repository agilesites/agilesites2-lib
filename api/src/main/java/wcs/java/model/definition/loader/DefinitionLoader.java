package wcs.java.model.definition.loader;

import wcs.api.Log;
import wcs.java.model.AttributeModelBase;
import wcs.java.model.DefinitionContainer;
import wcs.java.model.DefinitionModelBase;
import wcs.java.model.StartMenuModelBase;
import wcs.java.model.annotation.StartMenu;
import wcs.java.model.annotation.StartMenuItem;
import wcs.java.model.definition.WCSDefinition;
import wcs.java.model.type.WCSAttributeType;
import wcs.java.util.IdBeautifier;
import wcs.java.util.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

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

    protected Class<? extends WCSDefinition>[] classList;// = (Class<? extends WCSDefinition>[]) Util.classesFromResource("Telmore", "definitions.txt");

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
                    modelbase.startMenu(startMenu.type().toString(),dc,clazz.getSimpleName());

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
