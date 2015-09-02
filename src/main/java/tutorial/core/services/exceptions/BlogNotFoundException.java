package tutorial.core.services.exceptions;

/**
 * Created by nick on 2/09/15.
 */
public class BlogNotFoundException extends RuntimeException {
    public BlogNotFoundException() {

    }

    public BlogNotFoundException(String message) {
        super(message);
    }

    public BlogNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public BlogNotFoundException(Throwable cause) {
        super(cause);
    }

    protected BlogNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
