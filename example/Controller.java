package example;

public class Controller {

    public boolean wantOrder(Customer customer, int num) {
        Order order = new Order(customer, num);
        Stock stock = new Stock();

        if (!stock.inStock(num)) {
            return false;
        }

        Billing billing = new Billing(order);

        if (!billing.doBilling()) {
            return false;
        }

        Shipment shipment = new Shipment(order);
        return shipment.doShipment();
    }
}
