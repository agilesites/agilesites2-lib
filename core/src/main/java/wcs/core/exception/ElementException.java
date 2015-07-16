package wcs.core.exception;

/**
 * Created by alemonge1 on 14/07/2015.
 */
public class ElementException extends RuntimeException {
    public ElementException(String message) {
        super(message);
    }

    public ElementException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementException(Throwable cause) {
        super(cause);
    }
}
