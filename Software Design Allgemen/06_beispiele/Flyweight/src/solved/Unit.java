package solved;

public class Unit {
    public void fireAt() {
        Game game = Game.getInstance();
        ParticleFactory factory = ParticleFactory.getInstance();

        game.addParticle(factory.getBullet("1/1", "30", 10));
        game.addParticle(factory.getMissile("1/2", "20", 100));
        game.addParticle(factory.getMissile("3/2", "20", 100));
        game.addParticle(factory.getMissile("5/2", "20", 100));
        game.addParticle(factory.getMissile("6/2", "20", 100));

        game.draw();
    }
}