package Server.servertTaschenrechner2;

import Server.BackgroundThreadForClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainTaschenrechner {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)){


            while (true){
                Socket client = serverSocket.accept();

                BackgroundThreadforTaschenrechner2 backgroundThreadforTaschenrechner2 = new BackgroundThreadforTaschenrechner2(client);

                Thread thread = new Thread(backgroundThreadforTaschenrechner2);
                thread.start();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
