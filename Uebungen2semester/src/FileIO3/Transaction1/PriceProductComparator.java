package FileIO3.Transaction1;

import java.util.Comparator;

public class PriceProductComparator implements Comparator<Transaction> {
    @Override
    public int compare(Transaction lhs, Transaction rhs) {
        // Returns: (definition from function compare --> class Comparator<>)
        // - a negative integer if lhs is less than rhs
        // - zero if lhs is equal to rhs
        // - a positive integer if lhs is greater than rhs

        // 1. sort price asc
        if (lhs.getPrice() < rhs.getPrice())
            return -1;
        if (lhs.getPrice() > rhs.getPrice())
            return 1;

        // 2. price is the same -> sort product desc (ABSTEIGEND!!!)
        // return lhs.getProduct().compareTo(rhs.getProduct()); // --> aufsteigend sortiert
        return rhs.getProduct().compareTo(lhs.getProduct()); // --> absteigend sortiert
    }


    //Schreiben Sie einen Comparator mit dem Namen PriceProductComparator. Transaktionen sollen
    //zuerst nach dem Price aufsteigend und dann nach dem Produkt (Attribut Product) absteigend sortiert
    //werden.
}
