package Exceptions.übung;

public class SimpleExceptionDemo {
    public static void main(String[] args) {
        try {
            int zahl1 = 10;
            int zahl2 = 0;

            int ergebnis = divide(zahl1, zahl2);
            System.out.println("Ergebnis: " + ergebnis);

        } catch (MeineException e) {
            System.out.println("Fehler: Division durch 0 ist nicht erlaubt!"+ e.getMessage());
        }

        System.out.println("Programm läuft weiter...");
    }

    public static int divide(int a, int b) throws MeineException{
        if (b == 0){
            throw new MeineException("Division durch 0 geht nicht");
        }
        return a / b; // ➜ Wenn b = 0 → ArithmeticException
    }
}

