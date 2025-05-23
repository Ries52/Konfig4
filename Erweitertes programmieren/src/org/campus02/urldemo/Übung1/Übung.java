package org.campus02.urldemo.Übung1;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Übung {
    protected static List<String> liste = new ArrayList<>();



    public static void main(String[] args) {
        scanner("https://www.campus02.at");
    }

    public static void scanner(String i){
        try {
            URL myURL = new URL(i);

            try (BufferedReader br = new BufferedReader
                    (new InputStreamReader(myURL.openStream()));
                 BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\Website.txt"))
            ){

                String line;
                while ((line = br.readLine()) != null){
                    liste.add(line);

                    bw.write(line);
                    bw.newLine();

                    //System.out.println(line);
                }
                bw.flush();
                System.out.println(liste);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
