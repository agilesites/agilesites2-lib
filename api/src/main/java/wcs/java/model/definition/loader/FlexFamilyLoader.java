package wcs.java.model.definition.loader;

import wcs.core.Log;
import wcs.java.model.*;
import wcs.java.model.annotation.FlexFamily;
import wcs.java.model.annotation.FlexParent;
import wcs.java.model.annotation.FlexType;
import wcs.java.model.definition.WCSFlexFamily;
import wcs.java.model.type.WCSFlexAssetType;
import wcs.java.model.type.WCSFlexFamilyInfo;
import wcs.java.util.Util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

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
                for (Field f : clazz.getDeclaredFields()) {
                    // Loop through field attributes
                    for (Annotation ann : f.getAnnotations()) {
                        if (ann.annotationType() == FlexParent.class) {
                            FlexParent flexParentAnnotation = (FlexParent) ann;
                            WCSFlexAssetType flexType = new WCSFlexAssetType(
                                    f.getName(),
                                    flexParentAnnotation.description(),
                                    flexParentAnnotation.pluralForm(),
                                    info.getFlexDefInfo().getAssetTypeName(),
                                    info.getFlexParentDefInfo().getAssetTypeName());
                            flexType.setAttributeType(info.getFlexAttributeInfo().getAssetTypeName());
                            flexType.setFilterType(info.getFlexFilterInfo().getAssetTypeName());
                            modelbase.addFlexParent(flexType);
                        }
                        if (ann.annotationType() == FlexType.class) {
                            FlexType flexTypeAnnotation = (FlexType) ann;
                            WCSFlexAssetType flexType = new WCSFlexAssetType(
                                    f.getName(),
                                    flexTypeAnnotation.description(),
                                    flexTypeAnnotation.pluralForm(),
                                    flexTypeAnnotation.parentType(),
                                    info.getFlexDefInfo().getAssetTypeName());
                            flexType.setAttributeType(info.getFlexAttributeInfo().getAssetTypeName());
                            flexType.setFilterType(info.getFlexFilterInfo().getAssetTypeName());
                            modelbase.addFlexType(flexType);
                        }
                    }
                }
            }
        }
    }

}
