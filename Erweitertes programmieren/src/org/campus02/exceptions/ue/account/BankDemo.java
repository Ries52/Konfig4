package org.campus02.exceptions.ue.account;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        Bank bank= new Bank();
        Scanner scanner = new Scanner(System.in);
        int betrag = 0;
        String name= "";

        System.out.println("Gebe den Betrag ein");
        betrag= Integer.parseInt(scanner.next());
        System.out.println("Gib den Namen ein");
        name=scanner.next();
        




    }

}
