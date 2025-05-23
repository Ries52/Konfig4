import Factory.ArtDecoFactory;
import Factory.ModernFactory;

public class Main {
    public static void main(String[] args) {
        ShopSimulator shopSimulator = new ShopSimulator(new ArtDecoFactory());
        System.out.println(shopSimulator.giveChair());

    }
}
