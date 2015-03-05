package wcs.java.model.annotation;

import wcs.java.model.definition.WCSDefinition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Parent {
    public Class<? extends WCSDefinition> value();
    public boolean required() default false;
    public boolean multiple() default false;

}
