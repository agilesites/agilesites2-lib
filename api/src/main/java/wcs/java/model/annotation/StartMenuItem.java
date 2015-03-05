package wcs.java.model.annotation;

import wcs.java.model.enums.StartMenuTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface StartMenuItem {
    String name();
    StartMenuTypeEnum type();
    String assetType();
}
