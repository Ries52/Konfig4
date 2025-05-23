package ÜbungsblattzurIOVorlesung;

public class AddressExportException extends RuntimeException {
    public AddressExportException(String message) {
        super(message);
    }

    public AddressExportException(String message, Throwable cause) {
        super(message, cause);
    }
}
