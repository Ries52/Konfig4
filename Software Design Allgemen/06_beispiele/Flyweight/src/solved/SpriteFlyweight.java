package solved;


public class SpriteFlyweight {
    private final String sprite;
    private final String color;

    public SpriteFlyweight(String sprite, String color) {
        this.sprite = sprite;
        this.color  = color;
    }

    public String getSprite() {
        return sprite;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "SpriteFlyweight{" +
                "sprite='" + sprite + '\'' +
                ", color='"  + color  + '\'' +
                '}';
    }
}