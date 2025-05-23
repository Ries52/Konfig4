package org.campus02.exceptions.ue.account;

public class Account {
    private String owner;
    private double balance;
    private double overdraftFrame;


    public Account(String owner, double balance, double overdraftFrame) {
        this.balance = balance;
        this.owner = owner;
        this.overdraftFrame = overdraftFrame;
    }


    //aufbuchen
    public void credit(double amount){
        if (amount>0){
            balance += amount;
            System.out.println(amount+" Euro wurden aufgeucht"+balance+"Noch "+balance+" verfügbar");
        }else {
            System.out.println("Ungültiger Betrag");
        }

    }
    public void debit(double amount) throws NotEnoughMoneyException{
        if (balance+overdraftFrame<=0){
            throw new NotEnoughMoneyException("Nicht genug Guthaben auf dem Konto");
        } else if (balance+overdraftFrame>=0) {
            balance= balance-amount;
            System.out.println("Es wurden der Betrag von"+amount+" Euro abgehoben");
        }

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverdraftFrame() {
        return overdraftFrame;
    }

    public void setOverdraftFrame(double overdraftFrame) {
        this.overdraftFrame = overdraftFrame;
    }
}

