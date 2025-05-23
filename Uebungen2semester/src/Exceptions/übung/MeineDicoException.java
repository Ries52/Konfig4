package Exceptions.übung;

public class MeineDicoException extends RuntimeException {
    private int alter;

    public MeineDicoException(String message) {
        super(message);
    }

    public MeineDicoException(String message, int alter) {
        super(message);
        this.alter = alter;
        System.out.println(alter);

        System.out.println("Erst in "+wartezeit(alter)+" Jahren ist der Eintritt erlaubt");
    }
    public static int wartezeit (int alter){
        if (alter<18){
            return 18-alter;
        }
        return 0;
    }
}
