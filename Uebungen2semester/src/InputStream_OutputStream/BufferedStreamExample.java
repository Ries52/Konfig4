package InputStream_OutputStream;

import java.io.*;

public class BufferedStreamExample {
    public static void main(String[] args) {
        String quelle = "C:\\UebenProgrammieren\\sub-ordner\\dokumente\\XY.txt";         // Datei, die kopiert wird
        String ziel = "C:\\UebenProgrammieren\\sub-ordner\\dokumente\\XYZ.txt";              // Ziel-Datei

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(quelle));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(ziel));
        ) {
            int byteDaten;
            while ((byteDaten = bis.read()) != -1) {
                System.out.println(byteDaten);
                bos.write(byteDaten);
            }
            System.out.println("✅ Datei erfolgreich kopiert.");
        } catch (IOException e) {
            System.err.println("❌ Fehler beim Lesen oder Schreiben: " + e.getMessage());
        }
    }
}

