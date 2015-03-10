package wcs.java.model.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by jelerak on 3/9/2015.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface FlexFamily {
    String flexAttribute();
    String flexFilter();
    String flexAsset();
    String flexParent();
    String flexContentDefinition();
    String flexParentDefinition();

}
