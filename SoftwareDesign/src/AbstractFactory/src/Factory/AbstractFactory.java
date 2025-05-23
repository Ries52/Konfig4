package Factory;


import Chair.Chair;
import CoffeeTable.CoffeeTable;
import Sofa.Sofa;

public interface AbstractFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}