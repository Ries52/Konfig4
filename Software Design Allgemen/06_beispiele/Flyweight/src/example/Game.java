package example;

// Datei: Game.java
import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Particle> particles = new ArrayList<>();

    public void addParticle(Particle particle) {
        particles.add(particle);
    }

    public void draw() {
        for (Particle p : particles) {
            p.draw();
        }
    }
}