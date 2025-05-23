package example;

// Datei: Unit.java
public class Unit {
    private final Game game;

    public Unit(Game game) {
        this.game = game;
    }

    public void fireAt() {
        game.addParticle(new Particle("1/1", "30",  10, "red",   "bullet"));
        game.addParticle(new Particle("1/2", "20", 100, "green", "missile"));
        game.addParticle(new Particle("3/2", "20", 100, "green", "missile"));
        game.addParticle(new Particle("5/2", "20", 100, "green", "missile"));
        game.addParticle(new Particle("6/2", "20", 100, "green", "missile"));
        game.draw();
    }
}
