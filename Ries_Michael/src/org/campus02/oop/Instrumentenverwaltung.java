package org.campus02.oop;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Instrumentenverwaltung {
    private List<Musikinstrument> instrument = new ArrayList<>();

    public void addInstrument (Musikinstrument instr){
        instrument.add(instr);
    }
    public Map<String,Integer> getAnzahlProHersteller(){
        Map<String,Integer> anzahlproHersteller = new HashMap<>();

        for (int i = 0; i<instrument.size();i++){
            Musikinstrument musikinstrument = instrument.get(i);
            if (anzahlproHersteller.containsKey(musikinstrument.getHersteller())){
                int zwischenspeicheranzahl = anzahlproHersteller.get(musikinstrument.getHersteller());
                anzahlproHersteller.put(musikinstrument.getHersteller(), zwischenspeicheranzahl+1);
            }else {
                anzahlproHersteller.put(musikinstrument.getHersteller(), 1);
            }
        }
        return anzahlproHersteller;
    }
    public void  printAlleInstrument(){

        for (int i = 0; i<instrument.size();i++){
            Musikinstrument musikinstrument = instrument.get(i);
            System.out.println("Name: "+musikinstrument.getName()+"\t Hersteller: "+musikinstrument.getHersteller()+"\t Wert: "+musikinstrument.berechenWert());
        }
    }



}
