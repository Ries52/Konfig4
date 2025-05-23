package org.campus02.exceptions.ue.transporter;

import java.util.Scanner;

public class Episode42Demo {
    public static void main(String[] args) {
        Starship enterprise = new Starship("Enterprise");
        Scanner scanner= new Scanner(System.in);
        String beam = "";

        for (int i = 0;i<5;i++) {

            beam = "";
            System.out.println("Schreib: beam");
            beam = scanner.next();
            if (beam.equals("beam")) {
                System.out.println();
                enterprise.beamUp("Captain Kirk", "Riga IV");
            } else {
                System.out.println("Fehler");
            }
        }
    }
}
