package Server.servertaschenrechner;

import Server.BackgroundThreadForClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainTaschenrechenr {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)){
            System.out.println("Server Wartet");

            while (true){
                Socket client = serverSocket.accept();

                //BackgroundThreadForClient backgroundThreadForClient = new BackgroundThreadForClient(client);
                BackgroungThreadForTaschenrechener backgroungThreadForTaschenrechener = new BackgroungThreadForTaschenrechener(client);

                Thread thread = new Thread(backgroungThreadForTaschenrechener);
                thread.start();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
