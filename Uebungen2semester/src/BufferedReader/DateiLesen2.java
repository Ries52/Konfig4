package BufferedReader;

import java.io.*;

public class DateiLesen2 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\DateiSchreiben2.0.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
