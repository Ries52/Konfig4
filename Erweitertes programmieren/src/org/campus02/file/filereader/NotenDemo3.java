package org.campus02.file.filereader;

import java.io.*;

public class NotenDemo3 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter pw = new PrintWriter(new FileWriter("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\TEXT.txt"))){

            String line ;
            while (!(line = br.readLine()).equals("STOP")){
                System.out.println(line);
                pw.flush();
                pw.println(line);
            }
            pw.flush();
            System.out.println("exit");

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
