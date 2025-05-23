package solved;

public class Particle {
    private final String coords;
    private final String vector;
    private final int speed;
    private final SpriteFlyweight sprite;

    public Particle(String coords, String vector, int speed, SpriteFlyweight sprite) {
        this.coords = coords;
        this.vector = vector;
        this.speed  = speed;
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
                ", sprite="  + sprite  +
                '}';
    }
}