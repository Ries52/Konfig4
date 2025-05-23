package Exceptions.exceptions.ue.transporter;


public class Episode42 {
    public static void main(String[] args) {
        Starship enterprise = new Starship("Enterprise");

        for (int i = 0; i < 5; i++) {
            System.out.println("--- Versuch " + (i + 1) + " ---");
            enterprise.beamUp("Captain Kirk", "Riga IV");
            System.out.println();
        }
    }
}
