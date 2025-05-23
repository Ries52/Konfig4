package FileIO3.Transaction1;

public class Transaction {

    private String TransactionDate;
    private String Product;
    private double Price;
    private String PaymentType;
    private String Name;
    private String City;
    private String State;
    private String Country;
    //Schreiben Sie eine Klasse Transaction mit folgenden privaten Attributen:
    //▪ TransactionDate (String)
    //▪ Product (String)
    //▪ Price (double)
    //▪ PaymentType (String)
    //▪ Name (String)
    //▪ City (String)
    //▪ State (String)
    //▪ Country (String)
    //Erstellen Sie einen Konstruktor, toString()-Methode sowie getter()-Methoden für die Attribute.

    public Transaction(String transactionDate, String product, double price, String paymentType, String name, String city, String state, String country) {
        TransactionDate = transactionDate;
        Product = product;
        Price = price;
        PaymentType = paymentType;
        Name = name;
        City = city;
        State = state;
        Country = country;
    }

    @Override
    public String toString() {
        return "TransactionDate=" + TransactionDate +
                " Product=" + Product +
                " Price=" + Price +
                " PaymentType=" + PaymentType  +
                " Name=" + Name  +
                " City=" + City  +
                " State=" + State  +
                " Country=" + Country + "\n" ;
    }

    public String getTransactionDate() {
        return TransactionDate;
    }

    public String getProduct() {
        return Product;
    }

    public double getPrice() {
        return Price;
    }

    public String getPaymentType() {
        return PaymentType;
    }

    public String getName() {
        return Name;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getCountry() {
        return Country;
    }
}
