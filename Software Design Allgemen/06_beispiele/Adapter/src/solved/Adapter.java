package solved;

import shared.JSONData;
import shared.StockDataProvider;
import shared.XMLData;

public class Adapter implements NeedJSON {
    private final StockDataProvider provider;

    public Adapter(StockDataProvider provider) {
        this.provider = provider;
    }

    @Override
    public JSONData toJSON() {
        XMLData xml = provider.bieteXML();
        // einfacher „Mapping“-Schritt: XML → JSON
        String converted = xml.getXml() + " → { \"converted\": true }";
        return new JSONData(converted);
    }
}