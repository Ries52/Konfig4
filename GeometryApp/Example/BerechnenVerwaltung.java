package Example;

import java.util.Scanner;

public class BerechnenVerwaltung {
    Ausgabe ausgabe = new Ausgabe();
    Berechnung berechnung = new Berechnung();

    public void rechteck() {

        Scanner sc = new Scanner(System.in);

        // Rechteck
        System.out.println("Rechteck: Breite eingeben:");
        double width = sc.nextDouble();
        System.out.println("Rechteck: Höhe eingeben:");
        double height = sc.nextDouble();

        ausgabe.ausgabe(berechnung.berechnungRechteckFläche(width, height),
                berechnung.berchnungRechteckUmfang(width, height));

    }

    public void kreis() {
        Scanner sc = new Scanner(System.in);
        // Kreis
        System.out.println("Kreis: Radius eingeben:");
        double radius = sc.nextDouble();
        ausgabe.ausgabe(berechnung.berechnungKreisFläche(radius),
                berechnung.berechnungKreisUmfang(radius) );

    }
    public void dreieck(){
        Scanner sc = new Scanner(System.in);
        // Dreieck (gleichseitig)
        System.out.println("Dreieck: Seitenlänge eingeben:");
        double side = sc.nextDouble();
        ausgabe.ausgabe(berechnung.berechnungDreieckFläche(side),
                berechnung.berechnungDreieckUmfang(side));
    }

}
