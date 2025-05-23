package solved;

public class PlaneLogistics  extends Logistics {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
