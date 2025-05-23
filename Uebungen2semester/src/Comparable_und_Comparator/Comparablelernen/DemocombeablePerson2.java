package Comparable_und_Comparator.Comparablelernen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemocombeablePerson2 {
    public static void main(String[] args) {
        List<ComperablePerson2> personList2 = new ArrayList<>();
        List<ComparablePersonAlph2> personAlph2 =new ArrayList<>();

        personList2.add(new ComperablePerson2("Hans",34));
        personList2.add(new ComperablePerson2("Peter",50));
        personList2.add(new ComperablePerson2("Alex",21));
        personList2.add(new ComperablePerson2("Franz",60));
        personList2.add(new ComperablePerson2("Herbert",43));

       for (ComperablePerson2 person : personList2){
           personAlph2.add(new ComparablePersonAlph2(person.getName(),person.getAlter()));
       }

        Collections.sort(personList2);

        System.out.println("Sortiert von Jung  nach Alt:");
        for (ComperablePerson2 person : personList2){
            System.out.println(person);
        }

        System.out.println();
        Collections.sort(personList2,Collections.reverseOrder());
        System.out.println("Sortiert von Alt nach Jung:");
        for (ComperablePerson2 person2 : personList2){
            System.out.println(person2);
        }

        System.out.println();
        Collections.sort(personAlph2);
        System.out.println("Sortiert nach Name:");
        for (ComparablePersonAlph2 p : personAlph2){
            System.out.println(p);
        }
    }
}
