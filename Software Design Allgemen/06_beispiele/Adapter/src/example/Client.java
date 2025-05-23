package example;

import shared.AnalyticsLibrary;
import shared.JSONData;
import shared.StockDataProvider;
import shared.XMLData;

public class Client {

    // Konvertiert XMLData in JSONData
    private JSONData toJSON(XMLData data) {
        return new JSONData(data.getXml() + " -> converted to JSON");
    }

    // In Zukunft hier noch weitere Formate möglich:
    // private HTMLData toHTML(XMLData data) { ... }
    // private TXTData  toTXT(XMLData data)  { ... }
    // usw.

    public void run() {
        // inkompatible Bibliothek liefert nur XML
        StockDataProvider provider = new StockDataProvider();
        XMLData xml = provider.bieteXML();

        // Analytics-Bibliothek erwartet JSONData
        AnalyticsLibrary analytics = new AnalyticsLibrary();
        analytics.calculate(this.toJSON(xml));
    }

}