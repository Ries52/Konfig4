package Server;

import java.io.*;
import java.net.Socket;

public class BackgroundThreadForClient implements Runnable {
    private Socket Client;

    public BackgroundThreadForClient(Socket client) {
        Client = client;
    }

    @Override
    public void run() {
        try (// Server -> Client
             BufferedWriter output = new BufferedWriter(new OutputStreamWriter(Client.getOutputStream()));
             // Client -> Server
             BufferedReader input = new BufferedReader(new InputStreamReader(Client.getInputStream()));
        ) {

            Boolean disconnectClient = false;

//                    for(int i = 0; i < 10; i++){
//                        //my code
//                    }
//                    // --> is equivalent to:
//                    int i = 0;
//                    while(i < 10){
//                        //my code
//                        i++;
//                    }

            for (String clientCommand = input.readLine(); !clientCommand.isEmpty(); clientCommand = input.readLine()) {

                String[] splitCommand = clientCommand.split(" ");
                if (splitCommand.length == 3 && splitCommand[0].equals("add")) {
                    try {
                        int x = Integer.parseInt(splitCommand[1]);
                        int y = Integer.parseInt(splitCommand[2]);
                        output.write(x + " + " + y + " = " + (x + y));
                        output.newLine();
                        output.flush();
                        continue;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }

                switch (clientCommand.toLowerCase()) {
                    case "hallo":
                    case "hello":
                        output.write("Hi you");
                        output.newLine();
                        output.flush();
                        break;

                    case "how are you?":
                        output.write("I'm good, how are you?");
                        output.newLine();
                        output.flush();
                        break;

                    case "good":
                        output.write("That's nice to hear :)");
                        output.newLine();
                        output.flush();
                        break;


                    case "bad":
                        output.write("Oh no! I hope it gets better soon :)");
                        output.newLine();
                        output.flush();
                        break;

                    case "bye":
                        output.write("Bye client");
                        output.newLine();
                        output.flush();
                        disconnectClient = true;
                        break;

                    default:
                        output.write("I don't know what you mean");
                        output.newLine();
                        output.flush();
                        break;
                }

                if (disconnectClient) {
                    break;
                }
            }


//                    int i = 0;
//                    while(i < 5) {
//                        System.out.println("Client verbunden");
//                        output.write("Hallo von Server");
//                        output.newLine();
//                        output.flush();
//
//                        Thread.sleep(3000);
//                        i++;
//                    }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//                catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }

        System.out.println("Client is now be disconnected");
    }
}
