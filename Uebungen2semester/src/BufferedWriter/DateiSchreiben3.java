package BufferedWriter;

import java.io.*;

public class DateiSchreiben3 {
    public static void main(String[] args) {
        schreiben("Hallo","Versuch3");
        lesen();

    }
    public static void schreiben(String string,String string2){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\XY.txt"))){
            bw.write(string);
            bw.newLine();
            bw.write(string2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void lesen(){
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\XY.txt"))){
            String line;
            while ((line=br.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
