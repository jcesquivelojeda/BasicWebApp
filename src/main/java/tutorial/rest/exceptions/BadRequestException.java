package tutorial.rest.exceptions;

/**
 * Created by nick on 2/09/15.
 */
public class BadRequestException  extends RuntimeException{
    public BadRequestException() {

    }

    public BadRequestException(Throwable cause) {
        super(cause);
    }
}
