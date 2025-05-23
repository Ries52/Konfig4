package org.campus02.primzahl;

public class PrimzahlDemo {
    public static void main(String[] args) {
        PrimzahlPruefer p1 = new PrimzahlPruefer(1979990039);
        PrimzahlPruefer p2 = new PrimzahlPruefer(1989990047);
        PrimzahlPruefer p3 = new PrimzahlPruefer(1991990059);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);

        t1.start();
        t2.start();
        t3.start();

        // Warten bis Threads fertig
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Alle Überprüfungen abgeschlossen.");
    }
}

