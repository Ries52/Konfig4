package shared;

public class StockDataProvider {
    public XMLData bieteXML() {
        // hier würde normalerweise echtes XML geladen werden
        return new XMLData("<data>stock-werte</data>");
    }
}
