package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.List;

public class UngeradeZuerst1 {
    public static void main(String[] args) {
        List<Integer> zahlen = Arrays.asList(1, 5, 8, 2, 9, 3, 5);

        zahlen.sort((a, b) -> {
            // Zuerst nach gerade/ungerade sortieren
            if (a % 2 != b % 2) {
                return (a % 2 == 0) ? 1 : -1; // Ungerade zuerst
            }
            return Integer.compare(a, b); // Dann normal aufsteigend
        });

        System.out.println("Ungerade zuerst sortiert: " + zahlen);
    }
}
