package Server.ServerTaschenrechner3;

import java.io.*;
import java.net.Socket;

public class BackgroundthreadforTaschenrechner3 implements Runnable{
    private Socket client;

    public BackgroundthreadforTaschenrechner3(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {

        try (BufferedWriter output = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
             BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()))){


            Boolean schleife = true;

            while (schleife){

                String clientComand = input.readLine();
                String[] comand = clientComand.split(" ");

                if (comand.length == 3&& comand[0].equals("add")){

                    double x = Double.parseDouble(comand[1]);
                    double y = Double.parseDouble(comand[2]);

                    output.write(x+" + "+y+" = "+(x+y));
                    output.newLine();
                    output.flush();
                }
                if (comand.length == 3&& comand[0].equals("mal")){

                    double x = Double.parseDouble(comand[1]);
                    double y = Double.parseDouble(comand[2]);

                    output.write(x+" * "+y+" = "+(x*y));
                    output.newLine();
                    output.flush();
                }
                if (comand.length == 3&& comand[0].equals("minus")){

                    double x = Double.parseDouble(comand[1]);
                    double y = Double.parseDouble(comand[2]);

                    output.write(x+" - "+y+" = "+(x-y));
                    output.newLine();
                    output.flush();
                }
                if (comand.length == 3&& comand[0].equals("div")){

                    double x = Double.parseDouble(comand[1]);
                    double y = Double.parseDouble(comand[2]);

                    output.write(x+" / "+y+" = "+(x/y));
                    output.newLine();
                    output.flush();
                }
                if (comand[0].toLowerCase().equals("exit")){
                    output.write("ENDE");
                    output.newLine();
                    output.flush();
                    schleife= false;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
