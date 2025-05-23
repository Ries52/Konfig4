package Comparable_und_Comparator.Comparablelernen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparablePerson3 {
    public static void main(String[] args) {
        List<ComparablePerson3> personlist3 = new ArrayList<>();

        personlist3.add(new ComparablePerson3("Hans",35));
        personlist3.add(new ComparablePerson3("Sepp",20));
        personlist3.add(new ComparablePerson3("Franz",54));

        Collections.sort(personlist3);

        //System.out.println(personlist3);

        System.out.println("aufsteigend sortiert:");
        for (ComparablePerson3 person : personlist3){
            System.out.println(person);
        }

        System.out.println("Absteigent sortiert:");
        Collections.sort(personlist3.reversed());
        for (ComparablePerson3 person3 : personlist3){
            System.out.println(person3);
        }
    }

}
