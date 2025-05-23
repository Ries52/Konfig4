package org.campus02.socketdemo;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FirstServerSocket2 {
    public static void main(String[] args) {
        // Server starten und an Port binden
        System.out.println("Server wird hochgefahren...");

        try (ServerSocket serverSocket = new ServerSocket(12345)) {  // Port 12345 gewählt
            System.out.println("Server gestartet. Warte auf Clients...");

            while (true) { // Endlosschleife für mehrere Clients
                try (Socket client = serverSocket.accept();
                     BufferedWriter bw = new BufferedWriter(
                             new OutputStreamWriter(client.getOutputStream())
                     )) {
                    System.out.println("Client verbunden: " + client.getInetAddress());

                    // Nachricht an den Client senden
                    bw.write("Hallo, du bist mit dem Server verbunden!\n");
                    bw.flush();

                    System.out.println("Nachricht an Client gesendet.");
                } catch (IOException e) {
                    System.err.println("Fehler bei der Kommunikation mit dem Client: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Starten des Servers: " + e.getMessage());
        }
    }
}

