package networking.time;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {
    public static void main(String[] args) {
        int port = 1111;
        int clientCounter = 0;
        final int maxClients = 5;

        System.out.println("TimeServer läuft auf Port " + port);

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (clientCounter < maxClients) {
                try (Socket client = serverSocket.accept();
                     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))) {

                    clientCounter++;
                    System.out.println("Client #" + clientCounter + " verbunden.");

                    LocalDateTime now = LocalDateTime.now();
                    bw.write("Aktuelles Datum und Uhrzeit: " + now.toString());
                    bw.newLine();
                    bw.flush();

                } catch (IOException e) {
                    System.err.println("Fehler beim Verarbeiten eines Clients: " + e.getMessage());
                }
            }

            System.out.println("Maximale Anzahl an Clients erreicht. Server wird beendet.");

        } catch (IOException e) {
            System.err.println("Fehler beim Starten des Servers: " + e.getMessage());
        }
    }
}

