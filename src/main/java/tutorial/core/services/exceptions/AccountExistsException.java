package tutorial.core.services.exceptions;

/**
 * Created by nick on 2/09/15.
 */
public class AccountExistsException extends RuntimeException {
    public AccountExistsException() {

    }

    public AccountExistsException(String message) {
        super(message);
    }

    public AccountExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountExistsException(Throwable cause) {
        super(cause);
    }

    protected AccountExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
