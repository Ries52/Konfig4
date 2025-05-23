package org.campus02.primzahl;

public class PrimzahlPruefer implements Runnable {

    private long zahl;
    private boolean isPrim;

    public PrimzahlPruefer(long zahl) {
        this.zahl = zahl;
    }

    public boolean isPrim() {
        return isPrim;
    }

    @Override
    public void run() {
        if (zahl <= 1) {
            isPrim = false;
        } else {
            isPrim = true;
            for (long i = 2; i <=Math.sqrt(zahl); i++) { // zahl/2 oder Math.sqrt(zahl)auch möglich
                if (zahl % i == 0) {
                    isPrim = false;
                    break;
                }
            }
        }

        System.out.println("Zahl: " + zahl + " → Primzahl? " + isPrim);
    }
}

