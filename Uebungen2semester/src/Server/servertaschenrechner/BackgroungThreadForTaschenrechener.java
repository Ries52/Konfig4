package Server.servertaschenrechner;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class BackgroungThreadForTaschenrechener implements Runnable{
    private Socket client;

    public BackgroungThreadForTaschenrechener(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try (BufferedWriter output = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
             BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()))){

            boolean schleife = true;

            while (schleife){


                String clientComand = input.readLine();
                String[] splitcomand = clientComand.split(" ");

                if (splitcomand.length == 3 && splitcomand[0].equals("add")){

                    int x = Integer.parseInt(splitcomand[1]);
                    int y = Integer.parseInt(splitcomand[2]);

                    output.write(x+" + "+y+" = "+(x+y));
                    output.newLine();
                    output.flush();
                }
                if (splitcomand.length == 3 && splitcomand[0].equals("div")){

                    double a = Integer.parseInt(splitcomand[1]);
                    double b = Integer.parseInt(splitcomand[2]);

                    output.write(a+" / "+b+" = "+(a/b));
                    output.newLine();
                    output.flush();
                }
                if (splitcomand.length == 3 && splitcomand[0].equals("mal")){
                    int c = Integer.parseInt(splitcomand[1]);
                    int d = Integer.parseInt(splitcomand[2]);

                    output.write(c+" * "+d+" = "+(c*d));
                    output.newLine();
                    output.flush();
                }
                if (splitcomand.length == 3 && splitcomand[0].equals("minus")){
                    int e = Integer.parseInt(splitcomand[1]);
                    int f = Integer.parseInt(splitcomand[2]);

                    output.write(e+" - "+f+" = "+(e - f));
                    output.newLine();
                    output.flush();
                }
                if (splitcomand[0].equals("exit")){
                    schleife = false;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
