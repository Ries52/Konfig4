package Exceptions.übung;

public class SimpleExceptionDemo3 {
    public static void main(String[] args) {

        try {
            int zahl1 = 10;
            int zahl2 = 0;

            System.out.println(divison(zahl1,zahl2));
        }catch (Meine2teException e){
            System.out.println("Der fehler ist die division durch 0");
        }finally {
            System.out.println("Geht weiter.......");
        }

    }
    public static int divison(int zahl1,int zahl2){
        if (zahl2 ==0){
            throw new Meine2teException("Division durch 0 geht nicht");
        }
        return zahl1/zahl2;
    }
}
