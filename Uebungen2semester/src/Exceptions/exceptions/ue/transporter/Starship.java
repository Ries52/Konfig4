package Exceptions.exceptions.ue.transporter;

public class Starship {
    private String name;
    private Transporter transporter;

    public Starship(String name) {
        this.name = name;
        this.transporter = new Transporter();
    }

    public void beamUp(String person, String from) {
        try {
            transporter.beam(person, from, name, true);
        } catch (TransporterMalfunctionException e) {
            System.out.println("Fehler beim Beamen: " + e.getMessage());
        } finally {
            transporter.shutdown();
        }
    }
}
