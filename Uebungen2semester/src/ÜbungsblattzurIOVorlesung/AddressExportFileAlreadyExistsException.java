package ÜbungsblattzurIOVorlesung;

public class AddressExportFileAlreadyExistsException extends RuntimeException {
    public AddressExportFileAlreadyExistsException(String message) {
        super(message);
    }

    public AddressExportFileAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
