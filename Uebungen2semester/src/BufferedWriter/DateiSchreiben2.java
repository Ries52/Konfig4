package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DateiSchreiben2 {
    public static void main(String[] args) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\DateiSchreiben2.0.txt"))){
            br.write("Hallo");
            br.newLine();
            br.write("NEUE");
            br.newLine();
            br.write("Welt");
             } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Erfolgreich");
        }
    }
}
