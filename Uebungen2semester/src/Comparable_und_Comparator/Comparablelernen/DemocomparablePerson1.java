package Comparable_und_Comparator.Comparablelernen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemocomparablePerson1 {
    public static void main(String[] args) {
        List<ComparablePerson1> personenliste = new ArrayList<>();

        personenliste.add(new ComparablePerson1("Hans",50));
        personenliste.add(new ComparablePerson1("Alex",23));
        personenliste.add(new ComparablePerson1("Max",31));
        personenliste.add(new ComparablePerson1("Franz",24));
        personenliste.add(new ComparablePerson1("Michi",24));

        Collections.sort(personenliste);

        for (ComparablePerson1 Peson : personenliste){
            System.out.println(Peson);
        }
    }
}
