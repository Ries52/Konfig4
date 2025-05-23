package org.campus02.nummernraten;

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class NummerRaten {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(10);
        int input = -1;
        Scanner scanner= new Scanner(System.in);

        while (input!= randomNumber){
            System.out.println("Gib bitte eine Zahl ein: ");
            String userInput = scanner.next();
            input = Integer.parseInt(userInput);

            if (input != randomNumber){
                System.out.println("Lider nochmal");
            }

        }
        System.out.println("Richige Zahl");

    }
    private static int parseInput(String userInput) throws NotANumberException{
        try {
            return Integer.parseInt(userInput);
        }catch (NumberFormatException e){
            throw new NotANumberException("keine nummer eingegeben", e);
        }
    }
}
