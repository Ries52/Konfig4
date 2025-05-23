package Kochrezept2;


import java.util.Scanner;

public class Auswaehler {


    public static void auswaehlerbeginner(){
        RezeptHauptspeisen hauptspeisen = new RezeptHauptspeisen();
        RezeptMehlspeisen rezept = new RezeptMehlspeisen();
        Scanner scanner= new Scanner(System.in);

        System.out.println("Für wie viele Personen darf es sein?");
        int personen = scanner.nextInt();
        boolean wiederholen = true;

        while (wiederholen){
        System.out.println("Welches Rezept darf es sein?");
        String gesuchtesRezept = scanner.next();

        if (gesuchtesRezept.equals("Gugelhupf")){
            rezept.Gugelhupfrezept(personen);
            wiederholen=false;
        } else if (gesuchtesRezept.equals("Sachertorte")) {
            rezept.Sachertorte(personen);
            wiederholen=false;
        } else if (gesuchtesRezept.equals("Marmorkuchen")) {
            rezept.Marmorkuchen(personen);
            wiederholen=false;
        } else if (gesuchtesRezept.equals("GebratenenFisch")) {
            hauptspeisen.GrbratenFisch(personen);
            wiederholen=false;

        }else {
            System.out.println("das gesuchte Rezept haben wir leider nicht gefunden\ndas ist in der Auswahl: \nGugelhupf\nSachertorte\nMarmorkuchen\nGebratenenFisch");
            wiederholen=true;
        }}


    }
}
