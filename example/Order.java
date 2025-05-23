package example;

public class Order {
    private final Customer customer;
    private final int num;

    public Order(Customer customer, int num) {
        this.customer = customer;
        this.num = num;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public int getNum() {
        return num;
    }
}
