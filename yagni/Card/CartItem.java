package yagni.Card;

import java.util.Currency;

public class CartItem {
    private final double unitPrice;   // Nettopreis pro Stück in Euro (oder anderer Währung)
    private final Currency currency;  // z.B. Currency.getInstance("USD")
    private final int quantity;      // Stückzahl
    private final String name;

    public CartItem(String name, double unitPrice, Currency currency, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.currency  = currency;
        this.quantity  = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getQuantity() {
        return quantity;
    }
}
