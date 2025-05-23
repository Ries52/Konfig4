package org.campus02.pingpong;


import java.io.*;
import java.net.Socket;

public class PingPongclient2 {
    public static void main(String[] args) {
        try (Socket server = new Socket("localhost", 1111);
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(server.getOutputStream()));
             BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
             BufferedReader cli = new BufferedReader(new InputStreamReader(System.in))
        ) {
            System.out.println("Mit dem Server verbunden. Gib eine Nachricht ein:");

            String line;
            while ((line = cli.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();

                System.out.println("Client: " + line + " an Server gesendet");

                // Antwort vom Server lesen
                String response = br.readLine();
                if (response == null) {
                    System.out.println("Server hat die Verbindung geschlossen.");
                    break;
                }

                System.out.println("Server-Antwort: " + response);
            }
        } catch (IOException e) {
            System.err.println("Fehler bei der Verbindung: " + e.getMessage());
        }
    }
}

