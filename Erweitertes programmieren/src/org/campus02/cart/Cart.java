package org.campus02.cart;

public class Cart implements Comparable<Cart> {
    private String usrtname;
    private int numArticles;
    private int totalltemes;
    private double totalAmount;

    public String getUsrtname() {
        return usrtname;
    }

    public int getNumArticles() {
        return numArticles;
    }

    public int getTotalltemes() {
        return totalltemes;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "usrtname='" + usrtname + '\'' +
                ", numArticles=" + numArticles +
                ", totalltemes=" + totalltemes +
                ", totalAmount=" + totalAmount +
                '}';
    }

    public Cart(String usrtname, int numArticles, int totalltemes, double totalAmount) {
        this.usrtname = usrtname;
        this.numArticles = numArticles;
        this.totalltemes = totalltemes;
        this.totalAmount = totalAmount;


    }

    @Override
    public int compareTo(Cart o) {
        //return this.usrtname.campareTo(o.usrtname);
        return 0;
    }
}
