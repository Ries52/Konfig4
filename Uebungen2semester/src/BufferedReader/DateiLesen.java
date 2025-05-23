package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DateiLesen {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\DateiSchreiben2.0.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("❌ Fehler beim Lesen: " + e.getMessage());
        }
    }
}

