package org.campus02.socketdemo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FirstServerSocket {
    public static void main(String[] args) {
        //SErvererstellen und an port binden
        System.out.println("Server wird hochgefahren");

        try (ServerSocket serverSocket = new ServerSocket(1111)){

            System.out.println("Warten auf client");
           try (Socket client = serverSocket.accept();
                //kanal zum schreiben geöffnet
                BufferedWriter bw = new BufferedWriter(
                        new OutputStreamWriter(client.getOutputStream())
                )
           ){
              bw.write("Hallo");
              bw.flush();

               System.out.println("Daten an Client gesendet");
           }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Gesendet");
        }
    }
}
