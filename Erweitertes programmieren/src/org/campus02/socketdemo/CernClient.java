package org.campus02.socketdemo;

import java.io.*;
import java.net.Socket;

public class CernClient {
    public static void main(String[] args) {

        // Verbindungsaufbau: new Socket(..)
        // Shreiben: OutputStream
        // Lesen: InputStream
        try (Socket server = new Socket("info.cern.ch", 80);
             BufferedWriter bw = new BufferedWriter(
                     new OutputStreamWriter(server.getOutputStream())
             );
             BufferedReader br = new BufferedReader(
                     new InputStreamReader(server.getInputStream())
             )
        ){
            // hier habe ich nun
            // 1. connection
            // 2. möglichkeit zum schreiben und zu lesen

            // request an den server
            bw.write("GET / HTTP/1.1\r\nHost: info.cern.ch\r\n\r\n");
            bw.flush(); //!!!!

            // lesen(rspse bekommen)
            String line;
            while ((line = br.readLine())!= null){
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
