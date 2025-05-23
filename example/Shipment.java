package example;

public class Shipment {
    private Order order;

    public Shipment(Order order) {
        this.order = order;
    }

    public boolean doShipment() {
        return true;
    }
}
