package org.campus02.file.filereader;

import java.io.*;

public class NotenDemo {
    public static void main(String[] args) {

        File file = new File("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\noten.txt");

        try (BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\micha\\OneDrive\\Desktop\\sub-ordner\\dokumente\\versuch"))){

            String line;
            while (!(line = br.readLine()).equals("STOP")){
                System.out.println(line);
                pw.println(line);
                pw.flush();
            }

            pw.flush();
            System.out.println("exit");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
