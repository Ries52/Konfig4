package org.campus02.pingpong;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class PingPongServer2 {
    public static void main(String[] args) {
        try (ServerSocket serverSocket= new ServerSocket(1111)) {
            while (true){
                while (true) {
                    System.out.println("Server wartet auf client");
                    Socket client = serverSocket.accept();
                    System.out.println("Client verbunden!");

                    try (BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
                         PrintWriter pw = new PrintWriter(client.getOutputStream(), true)) {

                        String input;
                        while ((input = br.readLine()) != null) {
                            System.out.println("Empfangen: " + input);

                            if (input.equalsIgnoreCase("exit")) {
                                pw.println("Goodbye");
                                System.out.println("Verbindung beendet");
                                break;
                            }

                            switch (input) {
                                case "Pong":
                                    pw.println("Ping");
                                    break;
                                case "Ping":
                                    pw.println("Pong");
                                    break;
                                default:
                                    pw.println("Error");
                            }
                        }
                    } catch (IOException e) {
                        System.err.println("Fehler bei der Kommunikation mit dem Client: " + e.getMessage());
                    } finally {
                        try {
                            client.close();
                        } catch (IOException e) {
                            System.err.println("Fehler beim Schließen des Clients: " + e.getMessage());
                        }
                    }
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
