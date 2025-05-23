package solved;

import shared.AnalyticsLibrary;

public class Client {
    public void main(NeedJSON adapter) {
        AnalyticsLibrary analytics = new AnalyticsLibrary();
        analytics.calculate(adapter.toJSON());
    }
}
