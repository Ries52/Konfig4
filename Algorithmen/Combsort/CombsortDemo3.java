package Combsort;
import java.util.*;

public class CombsortDemo3 {
    public static void main(String[] args) {
        // Liste mit Zahlen 1 bis 10
        List<Integer> zahlen = new ArrayList<>(Arrays.asList(1,10,9,6,5,4,7,8,3,2));
        System.out.println("Initiale Liste: " + zahlen);

        // Comparator zum Vergleichen
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b; // Aufsteigend
            }
        };

        System.out.println("\nStarte Sortierung...\n");

        // Bubble Sort mit vollständiger Ausgabe nach jedem Schritt
        int n = zahlen.size();
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Runde " + (i + 1) + ":");
            for (int j = 0; j < n - i - 1; j++) {
                System.out.println("  Vergleiche " + zahlen.get(j) + " und " + zahlen.get(j + 1));
                if (comparator.compare(zahlen.get(j), zahlen.get(j + 1)) > 0) {
                    // Tauschen
                    int temp = zahlen.get(j);
                    zahlen.set(j, zahlen.get(j + 1));
                    zahlen.set(j + 1, temp);
                    //System.out.println("  => getauscht!");
                } else {
                    //System.out.println("  => nicht getauscht.");
                }
                System.out.println("  Aktuelle Liste: " + zahlen);
            }
            System.out.println("Ende Runde " + (i + 1) + ": " + zahlen + "\n");
        }

        System.out.println("Fertige sortierte Liste: " + zahlen);
    }
}
