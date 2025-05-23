package org.campus02.exceptions.ue.account;

import java.util.HashMap;

public class Bank {
    private HashMap<String,Account> accounts = new HashMap<>();



    private void addAccount(String owner,
                            double balance,
                            double overdraftFrame) throws BankException {
        if (accounts.containsKey(owner)){
            throw new BankException("schon vorhanden");
        }else {accounts.put(owner,new Account(owner,balance,overdraftFrame));
            accounts.put(owner,new Account(owner,balance,overdraftFrame));
            System.out.println("Konto erfolgreich erstellt.");

       }
    }
}
