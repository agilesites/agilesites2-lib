package agilesites.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by msciab on 14/06/15.
 */
@Target(ElementType.TYPE) @Retention(RetentionPolicy.CLASS)
public @interface Element {
}
