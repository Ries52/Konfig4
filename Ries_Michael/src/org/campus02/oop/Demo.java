package org.campus02.oop;

public class Demo {
    public static void main(String[] args) {
        Instrumentenverwaltung instrumentenverwaltung = new Instrumentenverwaltung();

        instrumentenverwaltung.addInstrument(new Gitarre("Mozart","Mozart",2000,1500,12,false));
        instrumentenverwaltung.addInstrument(new Gitarre("Mozart","Mozart",2000,1500,12,false));
        instrumentenverwaltung.addInstrument(new Gitarre("Mozart","Mozart",2000,1500,12,false));

        instrumentenverwaltung.addInstrument(new Klavier("Huber","Huber1",1990,5000,false));
        instrumentenverwaltung.addInstrument(new Klavier("Huber","Huber1",1990,5000,true));
        instrumentenverwaltung.addInstrument(new Klavier("Huber","Huber1",1990,5000,false));

        instrumentenverwaltung.addInstrument(new Saxophon("Huber","Huber1",1990,5000,"Messing"));
        instrumentenverwaltung.addInstrument(new Saxophon("Huber","Huber1",1990,5000,"Bronze"));
        instrumentenverwaltung.addInstrument(new Saxophon("Huber","Huber1",1990,5000,"Kunststoff"));

        System.out.println(instrumentenverwaltung.getAnzahlProHersteller());
        instrumentenverwaltung.printAlleInstrument();

    }
}
