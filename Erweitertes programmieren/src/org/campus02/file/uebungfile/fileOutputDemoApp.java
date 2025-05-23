package org.campus02.file.uebungfile;

import java.io.*;

public class fileOutputDemoApp {

    public static void main(String[] args) {
        File file = new File("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\lorem-ipsum.txt");

        try (FileOutputStream fos = new FileOutputStream(file)){
            fos.write(72);
            fos.write(73);
            fos.write(74);
            fos.write(75);
            fos.write(76);
            fos.write(77);
            fos.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream fis = new FileInputStream(file)){
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                System.out.print((char) byteRead + " "); // Byte in Zeichen umwandeln
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
