package yagni.Configuration;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class ConfigurationService {
    private final Currency targetCurrency = Currency.getInstance("EUR");
    private final boolean  vatEnabled     = true;
    private final double   vatRate        = 0.20; // 20%
    private final Map<Currency, Double> rates = new HashMap<>();

    public ConfigurationService() {
        this.rates.put(Currency.getInstance("EUR"), 1.0);
        this.rates.put(Currency.getInstance("USD"), 1.10);
        this.rates.put(Currency.getInstance("GBP"), 1.20);
    }

    public Currency getTargetCurrency() {
        return this.targetCurrency;
    }


    public boolean isVatEnabled() {
        return this.vatEnabled;
    }


    public double getVatRate() {
        return this.vatRate;
    }

    public Map<Currency, Double> getRates() {
        return rates;
    }
}
