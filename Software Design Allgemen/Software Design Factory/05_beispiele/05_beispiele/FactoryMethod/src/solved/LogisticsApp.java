package solved;

public class LogisticsApp {
    private final Logistics logistics;

    public LogisticsApp(Logistics logistics) {
        this.logistics = logistics;
    }

    public void planDelivery() {
        this.logistics.planDelivery();
    }
}
