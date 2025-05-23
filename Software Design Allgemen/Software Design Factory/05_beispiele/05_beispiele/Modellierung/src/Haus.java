import java.util.ArrayList;
import java.util.List;

public class Haus {
    private Dach dach;
    private List<Tuer> tueren = new ArrayList<>();
    private List<Fenster> fenster = new ArrayList<>();

    public Haus(Dach dach) {
        this.dach = dach;
    }

    public void addTuer(Tuer tuer) {
        this.tueren.add(tuer);
    }

    public void addFenster(Fenster fenster) {
        this.fenster.add(fenster);
    }

}
