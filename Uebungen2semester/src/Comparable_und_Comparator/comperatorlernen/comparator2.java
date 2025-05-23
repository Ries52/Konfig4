package Comparable_und_Comparator.comperatorlernen;

import java.util.*;

public class comparator2 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1,o2);
    }

    public static void main(String[] args) {
        List<Integer> zahlen2 = Arrays.asList(1,8,2,7,3,4,5,6,9);

        Collections.sort(zahlen2, new comparator2());

        System.out.println(zahlen2);
    }
}
