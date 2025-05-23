package org.campus02.aktuellesdatum;

import java.util.Date;

public class Aktuellesdatum {
    public static void main(String[] args) {
        Thread datumThread = new Thread();
    }
    public void runntime(){
        while (true){
            Date d = new Date();
            System.out.println(d.toString());

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

                break;
            }
        }


    }

}
