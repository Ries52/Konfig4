package org.campus02.file.uebungfile;


import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {
        File f = new File("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\lorem-ipsum.txt");

        try (FileInputStream fis = new FileInputStream(f)){
            int counter = 0;
            int bytRead= 0;

            while ((bytRead = fis.read()) != -1){
                counter++;
                char c = (char) bytRead;
                System.out.println(c);
            }
            System.out.println("counter "+ counter );
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
