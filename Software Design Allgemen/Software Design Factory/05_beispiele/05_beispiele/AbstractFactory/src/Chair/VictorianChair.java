package Chair;

public class VictorianChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("sitOn");
    }
}
