package Sofa;

public class ModernSofa implements Sofa {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("sitOn");
    }
}