package CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("sitOn");
    }
}