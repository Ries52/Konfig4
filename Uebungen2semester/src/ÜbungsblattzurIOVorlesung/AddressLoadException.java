package ÜbungsblattzurIOVorlesung;

public class AddressLoadException extends RuntimeException {
    public AddressLoadException(String message) {
        super(message);
    }

    public AddressLoadException(String message, Throwable cause) {
        super(message, cause);
    }
}
