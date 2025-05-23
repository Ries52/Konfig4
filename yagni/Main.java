package yagni;

import yagni.Card.CartItem;
import yagni.Configuration.ConfigurationService;
import yagni.PriceCalculator.PriceCalculator;

import java.util.Arrays;
import java.util.Currency;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Arrays ist eine Util Klasse
        List<CartItem> cart = Arrays.asList(
                new CartItem("Waschmittel", 29.90, Currency.getInstance("USD"),  2),
                new CartItem("Schokolade", 15.50, Currency.getInstance("EUR"), 1),
                new CartItem("Brot", 3.99,  Currency.getInstance("GBP"), 5)
        );

        PriceCalculator calculator = new PriceCalculator(new ConfigurationService());

        System.out.printf("Gesamtpreis (inkl. 20%% MwSt): %.2f €%n", calculator.calculateTotal(cart));
    }
}
