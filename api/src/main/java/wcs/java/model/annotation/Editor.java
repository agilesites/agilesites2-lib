package wcs.java.model.annotation;

import wcs.java.model.AttributeEnum;
import wcs.java.model.enums.Constants;
import wcs.java.util.NamingUtil;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Editor {
    String name();
    String description();

}


