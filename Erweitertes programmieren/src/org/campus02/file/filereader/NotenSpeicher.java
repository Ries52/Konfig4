package org.campus02.file.filereader;

import java.io.*;

public class NotenSpeicher {
    public static void main(String[] args) {
        File file = new File("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\noten.txt");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(file)) {

            System.out.println("🔹 Geben Sie Ihre Noten ein (Format: Fach: Note).");
            System.out.println("🔹 Geben Sie 'STOP' ein, um die Eingabe zu beenden.");

            while (true) {
                System.out.print("Eingabe: ");
                String line = reader.readLine();

                if ("STOP".equalsIgnoreCase(line)) {
                    break; // Beenden der Schleife
                }

                writer.write(line + "\n"); // Zeile in Datei schreiben
            }

            System.out.println("✅ Noten wurden in 'noten.txt' gespeichert.");

        } catch (IOException e) {
            System.err.println("❌ Fehler: " + e.getMessage());
        }
    }
}
