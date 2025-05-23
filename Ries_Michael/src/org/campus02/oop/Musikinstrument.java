package org.campus02.oop;

public abstract class Musikinstrument {
    private String name;
    private String hersteller;
    private int baujahr;
    private double grundpreis;

    public Musikinstrument(String name, String hersteller, int baujahr, double grundpreis) {
        this.name = name;
        this.hersteller = hersteller;
        this.baujahr = baujahr;
        this.grundpreis = grundpreis;
    }

    public String getAlter(){
        int alter = 2025-baujahr;
        String alterString= "Das Instrument ist "+alter;
        return alterString;
    }
    public abstract double berechenWert();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public double getGrundpreis() {
        return grundpreis;
    }

    public void setGrundpreis(double grundpreis) {
        this.grundpreis = grundpreis;
    }

    @Override
    public String toString() {
        return "Musikinstrument{" +
                "name='" + name + '\'' +
                ", hersteller='" + hersteller + '\'' +
                ", baujahr=" + baujahr +
                ", grundpreis=" + grundpreis +
                '}';
    }
}
