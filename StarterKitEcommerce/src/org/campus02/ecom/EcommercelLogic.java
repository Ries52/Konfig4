package org.campus02.ecom;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EcommercelLogic implements Runnable {
    private Socket socket;

    public EcommercelLogic(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        // wir sind hier auf der Server-Seite
        try (
                // Client -> Server
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                // Server -> Client
                BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))
        ) {

            String command  = "";
            BasketAnalyzer ba = null;
            while ((command = input.readLine()) != null) {
                if(command.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected from server (command: EXIT)");
                    break;
                }

                String[] commandParts = command.split(" ");
                if(commandParts.length == 0){
                    System.out.println("empty command");
                }

                if (commandParts[0].equals("OpenFile")) {
                    try {
                        if(commandParts.length != 2){
                            output.write("OpenFile must be called with two parameters:\nOpenFile myFilePath");
                            output.newLine();
                            output.flush();
                        }
                        else {
                            System.out.println("Try to open file with params: " + commandParts);
                            ArrayList<BasketData> list = BasketLoader.load(commandParts[1]);
                            ba = new BasketAnalyzer(list);
                            output.write(list.size() + " entries loaded");
                            output.newLine();
                            output.flush();
                        }
                    } catch (DataFileException e) {
                        output.write("Fehler beim Laden der Datei");
                        output.newLine();
                        output.flush();
                        e.printStackTrace();
                    }
                    catch (Exception e){
                        output.write("Fehler beim Laden der Datei: " + e.getMessage());
                        output.newLine();
                        output.flush();
                        e.printStackTrace();
                    }
                }
                else if (commandParts[0].equals("GetEveryNth")) {

                    if (commandParts.length != 2 || ba == null) {
                        output.write("Calling GetEveryNth without OpenFile");
                        output.newLine();
                        output.flush();
                        continue;
                    }

                    int n = Integer.parseInt(commandParts[1]);
                    ArrayList<BasketData> list = (ArrayList<BasketData>) ba.getEveryNthBasket(n);

                    for (BasketData bd : list) {
                        output.write(bd.toString());
                        output.newLine();
                    }
                    output.flush();
                }
                else if (commandParts[0].equals("GetStats")) {
                    if (ba == null) {
                        output.write("Calling Stats without OpenFile");
                        output.newLine();
                        output.flush();
                        continue;
                    }

                    HashMap<String, ArrayList<Double>> map = ba.groupByProductCategory();

                    for (Map.Entry<String, ArrayList<Double>> entry : map.entrySet()){

                        double sum = 0;
                        for (double d : entry.getValue()) {
                            sum += d;
                        }
                        double avg = sum / entry.getValue().size();

                        output.write(entry.getKey() + " > " + avg);
                        output.newLine();
                        output.flush();
                    }
                }
                else {
                    output.write("Unkown command");
                    output.newLine();
                    output.flush();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
