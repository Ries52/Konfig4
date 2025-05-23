package org.campus02.socketdemo;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.Socket;

public class Übung {
    public static void main(String[] args) {

        try (Socket server = SSLSocketFactory.getDefault().createSocket("www.campus02.at",443);
             BufferedWriter bw = new BufferedWriter(
                     new OutputStreamWriter(server.getOutputStream())
             );
             BufferedReader br = new BufferedReader(
                     new InputStreamReader(server.getInputStream())
             )
        ){
            bw.write("GET / HTTP/1.1\r\nHost: www.campus02.at\r\n\r\n");

            bw.flush();

            String line;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
