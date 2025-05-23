package InputStream_OutputStream;

import java.io.*;

public class Versuch2 {
    public static void main(String[] args) {
        String quelle ="C:\\UebenProgrammieren\\sub-ordner\\dokumente\\XY.txt";
        String ziel ="C:\\UebenProgrammieren\\sub-ordner\\dokumente\\XYA.txt";

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(quelle));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(ziel))
        ) {
            int daten;
            while ((daten = bis.read()) != -1){
                System.out.println(daten);
                bos.write(daten);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
