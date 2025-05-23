package yagni.PriceCalculator;

import yagni.Card.CartItem;
import yagni.Configuration.ConfigurationService;

import java.util.Currency;
import java.util.List;

public class PriceCalculator {
    private final ConfigurationService config;

    public PriceCalculator(ConfigurationService config) {
        this.config    = config;
    }


    public double convert(double amount, Currency from, Currency to) {
        double rateFrom = this.config.getRates().getOrDefault(from, 1.0); // getOrDefault Map Methode die den Default Wert zurückliefert wenn der Key nicht gefunden wird
        double rateTo   = this.config.getRates().getOrDefault(to,   1.0);
        // amount (in from) → in Basis → in Ziel
        return (amount * rateTo) / rateFrom;
    }

    /**
     * Summiert alle Positionen in der Zielwährung.
     * Multipliziert dann (optional) mit 1+vatRate.
     */
    public double calculateTotal(List<CartItem> items) {
        double sum = 0.0;
        var target = config.getTargetCurrency();

        for (CartItem item : items) {
            // 1) Umrechnung in Zielwährung
            double inTarget = this.convert(item.getUnitPrice(), item.getCurrency(), target);
            // 2) Menge berücksichtigen
            sum += inTarget * item.getQuantity();
        }

        // 3) Optional MwSt
        if (config.isVatEnabled()) {
            sum *= (1.0 + config.getVatRate());
        }

        return sum;
    }
}
