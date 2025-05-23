package Kochrezept1;

import Kochrezept1.Zutat;

public class Rezept {

    Zutat zutat=new Zutat();

public void Palatschinken(int personenanzahl){
    int mehlmengeguglhupf= (zutat.getMengemehl()*4)*personenanzahl;
    int eimengeguglhupf= (zutat.getMengeei()*3)*personenanzahl;
    int milchmengeguglhupf= (zutat.getMengemilch()*4)*personenanzahl;
    int zuckermengeguglhupf= (int) ((zutat.getMengezucker()*0)*personenanzahl);
    System.out.println("Rezept Palatschinken:\n"+zutat.getMehl()+"\t"+mehlmengeguglhupf+"\n"+
            zutat.getEi()+"\t"+eimengeguglhupf+"\n"+
            zutat.getMilch()+"\t"+milchmengeguglhupf+"\n"+
            zutat.getZucker()+"\t"+zuckermengeguglhupf+"\n");
}
    public void Marmorkuchen(int personenanzahl){
        int mehlmengeguglhupf= (int) ((zutat.getMengemehl()*2.5)*personenanzahl);
        int eimengeguglhupf= (zutat.getMengeei()*5)*personenanzahl;
        int milchmengeguglhupf= (zutat.getMengemilch()*4)*personenanzahl;
        int zuckermengeguglhupf= (int) ((zutat.getMengezucker()*5)*personenanzahl);
        System.out.println("Rezept Marmorkuchen:\n"+zutat.getMehl()+"\t"+mehlmengeguglhupf+"\n"+
                zutat.getEi()+"\t"+eimengeguglhupf+"\n"+
                zutat.getMilch()+"\t"+milchmengeguglhupf+"\n"+
                zutat.getZucker()+"\t"+zuckermengeguglhupf+"\n");
    }
    public void Sachertorte(int personenanzahl){
        int mehlmengeguglhupf= (zutat.getMengemehl()*5)*personenanzahl;
        int eimengeguglhupf= (zutat.getMengeei()*2)*personenanzahl;
        int milchmengeguglhupf= (zutat.getMengemilch()*4)*personenanzahl;
        int zuckermengeguglhupf= (int) ((zutat.getMengezucker()*2.5)*personenanzahl);
        System.out.println("Rezept Sachertorte:\n"+zutat.getMehl()+"\t"+mehlmengeguglhupf+"\n"+
                zutat.getEi()+"\t"+eimengeguglhupf+"\n"+
                zutat.getMilch()+"\t"+milchmengeguglhupf+"\n"+
                zutat.getZucker()+"\t"+zuckermengeguglhupf+"\n");
    }
    public void Schokokuchen(int personenanzahl){
        int mehlmengeguglhupf= (zutat.getMengemehl()*3)*personenanzahl;
        int eimengeguglhupf= (zutat.getMengeei()*2)*personenanzahl;
        int milchmengeguglhupf= (zutat.getMengemilch()*3)*personenanzahl;
        int zuckermengeguglhupf= (int) ((zutat.getMengezucker()*2)*personenanzahl);
        System.out.println("Rezept Schokokuchen:\n"+zutat.getMehl()+"\t"+mehlmengeguglhupf+"\n"+
                zutat.getEi()+"\t"+eimengeguglhupf+"\n"+
                zutat.getMilch()+"\t"+milchmengeguglhupf+"\n"+
                zutat.getZucker()+"\t"+zuckermengeguglhupf+"\n");
    }
}

