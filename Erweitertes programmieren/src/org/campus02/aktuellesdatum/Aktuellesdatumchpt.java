package org.campus02.aktuellesdatum;

import java.io.IOException;
import java.util.Date;

public class Aktuellesdatumchpt {
    public static void main(String[] args) {
        // Erstelle einen neuen Thread, der die Uhrzeit jede Sekunde ausgibt
        Thread timeThread = new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    // Hole das aktuelle Datum und die Uhrzeit
                    Date d = new Date();
                    System.out.println(d.toString());
                    try {
                        // Warte eine Sekunde (1000 Millisekunden)
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // Falls der Thread unterbrochen wird, beende den Thread
                        break;
                    }
                }
            }
        });

        // Starte den Thread
        timeThread.start();

        // Warte auf eine Enter-Taste, um den Thread zu stoppen
        try {
            System.in.read(); // Blockiert, bis Enter gedrückt wird
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Stoppe den Hintergrund-Thread, indem wir ihn unterbrechen
        timeThread.interrupt();
        System.out.println("Thread wurde gestoppt.");
    }
}

