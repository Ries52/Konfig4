package org.campus02.ecom;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BasketServerST {
    public static void main(String[] args) {
        BasketServerST myServer = new BasketServerST();
        myServer.startServer();
    }

    public void startServer() {
        System.out.println("Trying to start a server on port 80");
        try (ServerSocket server = new ServerSocket(80)){
            System.out.println("Started server on port 80");

            while (true) {

                System.out.println("waiting for client");
                Socket client = server.accept();
                System.out.println("client accepted");

                EcommercelLogic ecommerceLogic = new EcommercelLogic(client);
                Thread th = new Thread(ecommerceLogic);
                th.start();
                System.out.println("Thread started");

            }
        } catch (Exception e) {
            System.out.println("An Error occurred: " + e.getMessage());

        }
    }
}
