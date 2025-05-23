package solved;

// Datei: Game.java
import java.util.ArrayList;
import java.util.List;

public class Game {
    private static Game instance;
    private final List<Particle> particles = new ArrayList<>();

    private Game() {}

    public static synchronized Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void addParticle(Particle p) {
        particles.add(p);
    }

    public void draw() {
        for (Particle p : particles) {
            p.draw();
        }
    }
}