package example;

public class Particle {
    private final String coords;
    private final String vector;
    private final int speed;
    private final String color;
    private final String sprite;

    public Particle(String coords, String vector, int speed, String color, String sprite) {
        this.coords = coords;
        this.vector = vector;
        this.speed  = speed;
        this.color  = color;
        this.sprite = sprite;
    }

    public void draw() {
        System.out.println("draw " + this);
    }

    @Override
    public String toString() {
        return "Particle{" +
                "coords='"  + coords  + '\'' +
                ", vector='" + vector + '\'' +
                ", speed="   + speed   +
                ", color='"  + color   + '\'' +
                ", sprite='" + sprite  + '\'' +
                '}';
    }
}
