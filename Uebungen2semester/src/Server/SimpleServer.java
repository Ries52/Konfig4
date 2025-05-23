package Server;

// SimpleServer.java
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server läuft auf Port 1234 – warte auf Verbindung...");

            while (true) {
                try (Socket client = serverSocket.accept();
                     BufferedWriter bw = new BufferedWriter(
                             new OutputStreamWriter(client.getOutputStream())
                     )) {
                    System.out.println("Client verbunden.");
                    bw.write("Hallo vom Server!\r\n");
                    bw.flush();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

