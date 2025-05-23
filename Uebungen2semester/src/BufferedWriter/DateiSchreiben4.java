package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DateiSchreiben4 {
    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\XY.txt"))){

            bw.write("HALLO");
            bw.newLine();
            bw.write("Versuch4");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
