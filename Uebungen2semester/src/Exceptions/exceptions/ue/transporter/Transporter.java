package Exceptions.exceptions.ue.transporter;

public class Transporter {
    public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException {
        System.out.println(person + " wird von " + from + " nach " + to + " gebeamt...");

        if (urgent && Math.random() < 0.5) {
            throw new TransporterMalfunctionException("Transporter Fehlfunktion beim dringenden Beamen von " + person);
        }

        System.out.println("Beamen erfolgreich: " + person + " ist nun auf " + to);
    }

    public void shutdown() {
        System.out.println("Transporter wird heruntergefahren...");
    }
}
