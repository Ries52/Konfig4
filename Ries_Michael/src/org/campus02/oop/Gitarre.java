package org.campus02.oop;

public class Gitarre extends Musikinstrument {
    private int anzahlSaiten;
    private boolean elektro;

    public Gitarre(String name, String hersteller, int baujahr, double grundpreis, int anzahlSaiten, boolean elektro) {
        super(name, hersteller, baujahr, grundpreis);
        this.anzahlSaiten = anzahlSaiten;
        this.elektro = elektro;
    }

    @Override
    public double berechenWert() {//wert des Instruments

        if (anzahlSaiten==6){
            int alter = 2025-getBaujahr();
            return alter*50;
        }else if (anzahlSaiten==12){
            int alter1 = 2025-getBaujahr();
            return alter1*75;
        }
        System.out.println("Uns sind nur Gitarren mit Saiten von 6 und von 12 bekannt");
        return 0;
    }
}
