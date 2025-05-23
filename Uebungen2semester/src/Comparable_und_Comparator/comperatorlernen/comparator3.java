package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator3 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o2,o1);
    }

    public static void main(String[] args) {
        List<Integer> zahl3 = Arrays.asList(1,9,2,8,4,6,5,3,7);

        Collections.sort(zahl3, new comparator3());

        System.out.println(zahl3);
    }
}
