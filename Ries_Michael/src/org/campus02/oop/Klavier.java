package org.campus02.oop;

public class Klavier extends Musikinstrument {
    private boolean fluegel;

    public Klavier(String name, String hersteller, int baujahr, double grundpreis, boolean fluegel) {
        super(name, hersteller, baujahr, grundpreis);
        this.fluegel = fluegel;
    }

    @Override
    public double berechenWert() {

        if (fluegel == true){
            int alter = 2025-getBaujahr();
            return alter*100;
        }else if (fluegel == false){
            int alter1 = 2025-getBaujahr();
            return alter1*200;
        }
        return 0;
    }
}
