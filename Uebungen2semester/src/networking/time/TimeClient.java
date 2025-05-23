package networking.time;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;

public class TimeClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 1111;

        try (Socket socket = new Socket(host, port);
             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Vom Server empfangen: " + line);
            }

        } catch (IOException e) {
            System.err.println("Fehler beim Client: " + e.getMessage());
        }
    }
}

