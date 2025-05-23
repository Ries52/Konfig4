package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorString2_1 {
    public static void main(String[] args) {
        List<String> namensliste2 = Arrays.asList("Hans","Alex","Peter","Max");

        Collections.sort(namensliste2);

        System.out.println("Namen Sortiert:");

        for (String name : namensliste2){
            System.out.println("Vorname:\t"+name);
        }
    }
}
