package solved;

import java.util.HashMap;
import java.util.Map;

public class ParticleFactory {
    private static ParticleFactory instance;

    private final Map<String, SpriteFlyweight> spritesCache = new HashMap<>();

    private ParticleFactory() {}

    public static synchronized ParticleFactory getInstance() {
        if (instance == null) {
            instance = new ParticleFactory();
        }
        return instance;
    }

    private SpriteFlyweight getSprite(String sprite, String color) {
        if (!spritesCache.containsKey(sprite)) {
            spritesCache.put(sprite, new SpriteFlyweight(sprite, color));
        }
        return spritesCache.get(sprite);
    }

    public Particle getBullet(String coords, String vector, int speed) {
        return new Particle(coords, vector, speed,
                getSprite("bullet", "red"));
    }

    public Particle getMissile(String coords, String vector, int speed) {
        return new Particle(coords, vector, speed,
                getSprite("missile", "green"));
    }
}
