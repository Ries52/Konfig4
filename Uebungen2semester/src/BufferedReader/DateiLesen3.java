package BufferedReader;

import java.io.*;

public class DateiLesen3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\XY.txt"))){

            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
