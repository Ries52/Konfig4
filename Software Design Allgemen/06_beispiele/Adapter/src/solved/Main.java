package solved;

import shared.StockDataProvider;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StockDataProvider incompatibleLibrary = new StockDataProvider();
        NeedJSON adapter = new Adapter(incompatibleLibrary);

        Client client = new Client();
        client.main(adapter);
    }
}