package Kochrezept2;

public class RezeptMehlspeisen {
    Zutaten zutaten= new Zutaten();
    public static void Gugelhupfrezept (int personenanzahl){
        Zutaten zutaten= new Zutaten();
        int mehl = ((zutaten.getMengeMehl()*1)*personenanzahl);
        int zucker = ((zutaten.getMengeZucker()*3)*personenanzahl);
        int milch = ((zutaten.getMengeMilch()*2)*personenanzahl);
        int ei = ((zutaten.getMengeEi()*2)*personenanzahl);
        int schlagobers = (int) ((zutaten.getMengeSchlagobers()*0.5)*personenanzahl);
        System.out.println("Rezept für Gugelhupf:\n"+zutaten.getMehl()+"\t"+mehl+"\n"+
                zutaten.getZucker()+"\t"+zucker+"\n"+
                zutaten.getMilch()+"\t"+milch+"\n"+
                zutaten.getEi()+"\t"+ei+"\n"+
                zutaten.getSchlagobers()+"\t"+schlagobers+"\n");
    }
    public static void Sachertorte (int personenanzahl){
        Zutaten zutaten= new Zutaten();
        int mehl = ((zutaten.getMengeMehl()*2)*personenanzahl);
        int zucker = ((zutaten.getMengeZucker()*1)*personenanzahl);
        int milch = ((zutaten.getMengeMilch()*4)*personenanzahl);
        int ei = ((zutaten.getMengeEi()*2)*personenanzahl);
        int schlagobers = ((zutaten.getMengeSchlagobers()*3)*personenanzahl);
        System.out.println("Rezept für Sachertorte:\n"+zutaten.getMehl()+"\t"+mehl+"\n"+
                zutaten.getZucker()+"\t"+zucker+"\n"+
                zutaten.getMilch()+"\t"+milch+"\n"+
                zutaten.getEi()+"\t"+ei+"\n"+
                zutaten.getSchlagobers()+"\t"+schlagobers+"\n");
    }
    public static void Marmorkuchen (int personenanzahl){
        Zutaten zutaten= new Zutaten();
        int mehl = ((zutaten.getMengeMehl()*2)*personenanzahl);
        int zucker = ((zutaten.getMengeZucker()*3)*personenanzahl);
        int milch = ((zutaten.getMengeMilch()*1)*personenanzahl);
        int ei = ((zutaten.getMengeEi()*3)*personenanzahl);
        int schlagobers = ((zutaten.getMengeSchlagobers()*3)*personenanzahl);
        System.out.println("Rezept für Marmorkuchen:\n"+zutaten.getMehl()+"\t"+mehl+"\n"+
                zutaten.getZucker()+"\t"+zucker+"\n"+
                zutaten.getMilch()+"\t"+milch+"\n"+
                zutaten.getEi()+"\t"+ei+"\n"+
                zutaten.getSchlagobers()+"\t"+schlagobers+"\n");
    }
}
