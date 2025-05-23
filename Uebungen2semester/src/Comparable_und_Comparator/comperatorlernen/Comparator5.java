package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator5 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1,o2);
    }

    public static void main(String[] args) {
        List<Integer> zahl5 = Arrays.asList(1,6,2,4,3,5,9,7,6,5,44,55,66,22,11,77,99,88,33,100,8,10);

        Collections.sort(zahl5,new Comparator5());

        System.out.println(zahl5);
    }
}
