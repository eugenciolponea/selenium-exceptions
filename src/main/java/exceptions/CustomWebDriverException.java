package exceptions;

public class CustomWebDriverException extends RuntimeException {
    public CustomWebDriverException(String message) {
        super(message);
    }
}
