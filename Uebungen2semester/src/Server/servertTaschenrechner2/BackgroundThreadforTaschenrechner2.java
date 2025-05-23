package Server.servertTaschenrechner2;



import java.io.*;
import java.net.Socket;
import java.util.Objects;

public class BackgroundThreadforTaschenrechner2 implements Runnable {
    private Socket client;

    public BackgroundThreadforTaschenrechner2(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {

        try (BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
             BufferedWriter output = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))){

            boolean schleife = true;

            while (schleife) {
                String clientComand = input.readLine();
                String[] comand = clientComand.split(" ");

                if (comand.length == 3&& comand[0].equals("add")){

                    int x = Integer.parseInt(comand[1]);
                    int y = Integer.parseInt(comand[2]);

                    output.write(x+ " + "+y+" = "+(x+y));
                    output.newLine();
                    output.flush();
                }
                if (comand[0].equals("exit")){
                    output.write("ENDE");
                    output.newLine();
                    output.flush();
                    schleife = false;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
