package Combsort;
import java.util.*;

public class CombsortDemo {
    public static void main(String[] args) {
        // Liste mit Zahlen 1 bis 10 in zufälliger Reihenfolge
        List<Integer> zahlen = Arrays.asList(1,10,9,6,5,4,7,8,3,2);
        Collections.shuffle(zahlen);  // zufällige Reihenfolge
        System.out.println("Unsortiert: " + zahlen);

        // Comparator zum Sortieren in aufsteigender Reihenfolge
        Comparator<Integer> aufsteigend = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        };

        // Sortieren
        Collections.sort(zahlen, aufsteigend);
        System.out.println("Sortiert: " + zahlen);
    }
}

