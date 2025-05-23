package org.campus02.oop;

public class Saxophon extends Musikinstrument{
    private String material;//Messing,Bronze,Kunststoff

    public Saxophon(String name, String hersteller, int baujahr, double grundpreis, String material) {
        super(name, hersteller, baujahr, grundpreis);
        this.material = material;
    }

    @Override
    public double berechenWert() {
        int alter = 2025-getBaujahr();

        if (material.equals("Messing")){
            return alter*120;
        } else if (material.equals("Bronze")) {
            return alter*150;
        } else if (material.equals("Kunststoff")) {
            return alter*80;
        }
        System.out.println("Wir bewerten nur Material von (Messing,Bronze,Kunststoff)");
        return 0;
    }
    public String getKategorie(){
        switch (material){
            case "Messing", "Bronze":
                return "Blasinstrument";
            case "Kunststoff":
                return "Experimentelles Instrument";
            default:
                return "Ungültiges Material";
        }
    }
}
