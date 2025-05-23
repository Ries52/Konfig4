package Exceptions.übung;

public class SimpleExceptionDeomo2 {
    public static void main(String[] args) {
        int zahl1 = 10;
        int zahl2 = 0;

        System.out.println(division(zahl1,zahl2));



    }
    public static int division (int zahl1, int zahl2) throws MeineException{
        if (zahl2 == 0){
            throw new MeineException("Division durch 0 geht nicht");
        }
        return zahl1/zahl2;
    }
}
