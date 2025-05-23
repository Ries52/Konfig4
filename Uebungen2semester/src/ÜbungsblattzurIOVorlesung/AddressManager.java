package ÜbungsblattzurIOVorlesung;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressManager {
    private List<Address> addresses = new ArrayList<>();

    public List<Address> getAddresses() {
        return addresses;
    }

    public void add(Address a) {
        addresses.add(a);
    }

    public void loadFromCsv(String path, String separator) throws AddressLoadException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(separator);
                if (parts.length != 4) {
                    throw new AddressLoadWrongFormatException("Ungültige Zeile: " + line);
                }
                Address address = new Address(parts[0], parts[1], parts[2], parts[3]);
                addresses.add(address);
            }
        } catch (IOException e) {
            throw new AddressLoadException("Fehler beim Laden der Datei", e);
        }
    }

    public void exportToCsv(String path, String separator) throws AddressExportException {
        File file = new File(path);
        if (file.exists()) {
            throw new AddressExportFileAlreadyExistsException("Datei existiert bereits: " + path);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Address address : addresses) {
                bw.write(address.getFirstname() + separator + address.getLastname() + separator
                        + address.getMobilNumber() + separator + address.getEmail());
                bw.newLine();
            }
        } catch (IOException e) {
            throw new AddressExportException("Fehler beim Exportieren", e);
        }
    }
}

