package org.campus02.pingpong;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class PingPongObjectClient {
    public static void main(String[] args) {
        try (Socket server = new Socket("localhost",1111);
             BufferedWriter bw = new BufferedWriter(
                     new OutputStreamWriter(server.getOutputStream())
             );
             BufferedReader br = new BufferedReader(
                     new InputStreamReader(server.getInputStream())
             );
             BufferedReader cli = new BufferedReader(
                     new InputStreamReader(System.in)
             )
        ){
            // von der Komando zeile
            String line;
            while ((line = cli.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();

                System.out.println(line+" an server gesendet");

                String response = br.readLine();
                System.out.println("response "+ response);

            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
