package Combsort;

import java.util.*;

public class CombsortDemo2{
    public static void main(String[] args) {
        // Liste mit den Zahlen 1 bis 10
        List<Integer> zahlen = new ArrayList<>(Arrays.asList(1,10,9,6,5,4,7,8,3,2));
        System.out.println("Initiale Liste: " + zahlen);

        // Mischen der Liste
        Collections.shuffle(zahlen);
        System.out.println("Nach dem Mischen: " + zahlen);

        // Comparator mit Ausgaben bei jedem Vergleich
        Comparator<Integer> aufsteigend = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                System.out.println("Vergleiche " + a + " mit " + b);
                return a - b;
            }
        };

        System.out.println("\nStarte Sortierung...");
        // Sortieren mit dem Comparator
        Collections.sort(zahlen, aufsteigend);
        System.out.println("Sortierte Liste: " + zahlen);
    }
}

