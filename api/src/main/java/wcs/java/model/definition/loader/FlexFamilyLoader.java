package wcs.java.model.definition.loader;

import wcs.api.Log;
import wcs.java.model.*;
import wcs.java.model.annotation.FlexFamily;
import wcs.java.model.annotation.StartMenu;
import wcs.java.model.annotation.StartMenuItem;
import wcs.java.model.definition.WCSDefinition;
import wcs.java.model.definition.WCSFlexFamily;
import wcs.java.model.definition.WCSFlexFamilyInfo;
import wcs.java.model.type.WCSAttributeType;
import wcs.java.util.IdBeautifier;
import wcs.java.util.StringUtils;
import wcs.java.util.Util;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

import static wcs.Api.getLog;

public class FlexFamilyLoader {
    final static Log log = getLog(FlexFamilyLoader.class);

    protected Class<? extends WCSFlexFamily>[] classList;

    public FlexFamilyLoader(String site) {
        this.classList = (Class<? extends WCSFlexFamily>[]) Util.classesFromResource(site, "families.txt");
    }

    public void saveFlexFamilies(FlexFamilyModelBase modelbase) {
        for(Class<? extends WCSFlexFamily> clazz : classList) {
            if (clazz.isAnnotationPresent(FlexFamily.class)) {
                FlexFamily a = clazz.getAnnotation(FlexFamily.class);
                WCSFlexFamilyInfo info = new WCSFlexFamilyInfo();
                info.flexAsset(a.flexAsset(), a.flexAsset(), a.flexAsset() + "s");
                info.flexAttribute(a.flexAttribute(), a.flexAttribute(), a.flexAttribute() + "s");
                info.flexDef(a.flexContentDefinition(), a.flexContentDefinition(), a.flexContentDefinition() + "s");
                info.flexFilter(a.flexFilter(), a.flexFilter(), a.flexFilter() + "s");
                info.flexParent(a.flexParent(), a.flexParent(), a.flexParent() + "s");
                info.flexParentDef(a.flexParentDefinition(), a.flexParentDefinition(), a.flexParentDefinition() + "s");
                modelbase.addFlexFamilyData(info);
            }
        }
    }

}
