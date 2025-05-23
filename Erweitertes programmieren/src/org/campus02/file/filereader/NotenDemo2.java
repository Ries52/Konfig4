package org.campus02.file.filereader;

import java.io.*;

public class NotenDemo2 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pr = new PrintWriter(new FileWriter("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\TEXT.txt"))){

            String line;
            while (!(line = br.readLine()).equals("STOP")){
                System.out.println(line);
                pr.println(line);
                pr.flush();
            }

            pr.flush();
            System.out.println("exit");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
