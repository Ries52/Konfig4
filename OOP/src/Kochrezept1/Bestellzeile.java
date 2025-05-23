package Kochrezept1;

public class Bestellzeile {
    private String Gugelhupf;
    private int menge = 2;
    private int preis = 3;

    public double getKosten(){
        int kosten = menge * preis;

        return kosten;
    }



    public String getArtikel() {
        return Gugelhupf;
    }

    public int getMenge() {
        return menge;
    }

    public int getPreis() {
        return preis;
    }
}
