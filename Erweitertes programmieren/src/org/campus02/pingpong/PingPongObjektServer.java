package org.campus02.pingpong;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class PingPongObjektServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket= new ServerSocket(1111)) {
            while (true){
                System.out.println("Server wartet auf client");

                try (Socket client = serverSocket.accept();
                     BufferedReader br = new BufferedReader(
                             new InputStreamReader(client.getInputStream())
                     );
                     PrintWriter pw = new PrintWriter(
                             new OutputStreamWriter(client.getOutputStream())
                     )
                ) {


                    String input;
                    while ((input = br.readLine())!=null){

                        if (input.equalsIgnoreCase("exit")){
                            pw.println("Good bye");
                            pw.flush();
                            System.out.println("Verbindung beendet");
                            break;
                        }

                        switch (input){
                            case "Pong":
                                pw.write("ping");
                                break;
                            case "Ping":
                                pw.write("Pong");
                                break;
                            default:
                                pw.write("Error");
                        }
                        pw.flush();
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
