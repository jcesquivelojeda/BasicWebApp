package tutorial.rest.exceptions;

/**
 * Created by nick on 2/09/15.
 */
public class NotFoundException extends RuntimeException{
    public NotFoundException() {

    }

    public NotFoundException(Throwable cause) {
        super(cause);
    }
}
