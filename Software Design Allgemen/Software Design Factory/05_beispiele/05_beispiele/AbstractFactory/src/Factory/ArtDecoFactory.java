package Factory;

import Chair.*;
import CoffeeTable.*;
import Sofa.*;

public class ArtDecoFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
