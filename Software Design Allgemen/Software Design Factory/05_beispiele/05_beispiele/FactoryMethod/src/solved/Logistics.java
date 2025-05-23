package solved;

public abstract class Logistics {
    public void planDelivery() {
        this.createTransport().deliver();
    }

    public abstract Transport createTransport();
}
