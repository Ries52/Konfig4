package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator7 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1,o2);
    }

    public static void main(String[] args) {
        List<Integer> zahlen7 = Arrays.asList(1,6,2,5,3,4,8,9);

        Collections.sort(zahlen7);

        System.out.println(zahlen7);
    }
}
