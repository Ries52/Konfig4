package Server.ServerTaschenrechner3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainTaschenrechner3 {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(1234)) {

            while (true) {
                Socket client = serverSocket.accept();

                BackgroundthreadforTaschenrechner3 backgroundthreadforTaschenrechner3 = new BackgroundthreadforTaschenrechner3(client);

                Thread thread = new Thread(backgroundthreadforTaschenrechner3);
                thread.start();
            }

            } catch(IOException e){
                throw new RuntimeException(e);
            }

    }
}
