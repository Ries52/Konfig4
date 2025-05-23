package ÜbungsblattzurIOVorlesung;

import java.util.List;

public class DemoMain {
    public static void main(String[] args) {
        AddressManager manager = new AddressManager();

        // CSV-Dateipfad angeben
        String path = "C:\\UebenProgrammieren\\sub-ordner\\dokumente\\Ad.csv";
        String separator = ";";

        // Versuche Adressen aus CSV zu laden
        try {
            manager.loadFromCsv(path, separator);
            System.out.println("Adressen erfolgreich geladen!");
        } catch (AddressLoadWrongFormatException e) {
            System.err.println("Falsches Format in CSV: " + e.getMessage());
        } catch (AddressLoadException e) {
            System.err.println("Fehler beim Laden: " + e.getMessage());
        }

        // Zeige alle geladenen Adressen
        System.out.println("\n🔎 Aktuelle Adressen:");
        for (Address a : manager.getAddresses()) {
            System.out.println(a);
        }

        // Neue Adresse hinzufügen
        Address neueAdresse = new Address("Max", "Mustermann", "123456789", "max@example.com");
        manager.add(neueAdresse);
        System.out.println("\n✅ Neue Adresse hinzugefügt.");

        // Versuche alles zu exportieren
        try {
            manager.exportToCsv("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\Ad2.csv", separator);
            System.out.println("\n💾 Adressen erfolgreich exportiert.");
        } catch (AddressExportFileAlreadyExistsException e) {
            System.err.println("❌ Datei existiert bereits: " + e.getMessage());
        } catch (AddressExportException e) {
            System.err.println("❌ Fehler beim Exportieren: " + e.getMessage());
        }
    }
}

