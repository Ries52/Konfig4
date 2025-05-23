package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DateiSchreiben {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\DateiSchreiben1.0.txt"))) {
            bw.write("Hallo Welt!");
            bw.newLine();
            bw.write("Hallo Welt1!");
            bw.newLine();
            bw.write("Hallo Welt2!");
            bw.newLine(); // Zeilenumbruch
            bw.write("Das ist eine weitere Zeile.");
            System.out.println("✅ Datei wurde erfolgreich geschrieben.");
        } catch (IOException e) {
            System.err.println("❌ Fehler beim Schreiben: " + e.getMessage());
        }
    }
}
