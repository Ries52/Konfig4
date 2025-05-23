package example;

public class Billing {
    private final Order order;

    public Billing(Order order) {
        this.order = order;
    }

    public boolean doBilling() {
        return true;
    }
}
