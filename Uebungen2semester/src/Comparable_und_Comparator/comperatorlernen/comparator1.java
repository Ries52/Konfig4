package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator1 implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1,o2);
    }

    public static void main(String[] args) {
        List<Integer> zahlen1 = Arrays.asList(1,9,2,8,3,7,4,6,5);

        Collections.sort(zahlen1,new comparator1());

        System.out.println(zahlen1);
    }
}
