package Kochrezept2;

public class RezeptHauptspeisen {
    public static void GrbratenFisch (int personenanzahl){
        Zutaten zutaten= new Zutaten();
        int fisch = ((zutaten.getMengefisch()*2)*personenanzahl);
        int salz = 3*personenanzahl;
        int pfeffer = 1*personenanzahl;
        int kümmel = ((zutaten.getMengekümmer()*3)*personenanzahl);
        int oel = ((zutaten.getMengeoel()*3)*personenanzahl);
        System.out.println("Rezept für Marmorkuchen:\n"+zutaten.getFisch()+"\t"+fisch+"\n"+
                zutaten.getSalz()+"\t"+salz+" "+zutaten.getMengesalz()+"\n"+
                zutaten.getPfeffer()+"\t"+pfeffer+" "+zutaten.getMengepfeffer()+"\n"+
                zutaten.getKümmel()+"\t"+kümmel+"\n"+
                zutaten.getOel()+"\t"+oel+"\n");
    }
}
