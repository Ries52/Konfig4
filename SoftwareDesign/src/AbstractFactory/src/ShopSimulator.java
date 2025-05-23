import Chair.Chair;
import CoffeeTable.CoffeeTable;
import Factory.AbstractFactory;
import Sofa.Sofa;

public class ShopSimulator {
    private final AbstractFactory factory;

    public ShopSimulator(AbstractFactory factory) {
        this.factory = factory;
    }

    public Chair giveChair() {
        return factory.createChair();
    }

    public CoffeeTable giveCoffeeTable() {
        return factory.createCoffeeTable();
    }

    public Sofa giveSofa() {
        return factory.createSofa();
    }
}