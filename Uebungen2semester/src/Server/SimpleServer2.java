package Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer2 {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)){
            System.out.println("Server wartet auf verbindung");

            while (true) {
                Socket client = serverSocket.accept();
                BackgroundThreadForClient clientsRunnable = new BackgroundThreadForClient(client);

                Thread bkgThread = new Thread(clientsRunnable);
                bkgThread.start();

                System.out.println("Started a bkg thread so that we can listen for the next client");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void CallMyFunction(){

        System.out.println("Help the client called this function :O");
    }
}
