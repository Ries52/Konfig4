package InputStream_OutputStream;

import java.io.*;

public class Versuch1 {
    public static void main(String[] args) {
        String quelle = "C:\\UebenProgrammieren\\sub-ordner\\dokumente\\XY.txt";

        try (BufferedInputStream bi = new BufferedInputStream(new FileInputStream(quelle))){


            int byteDaten;
            while ((byteDaten = bi.read()) != -1){
                System.out.println(byteDaten);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
