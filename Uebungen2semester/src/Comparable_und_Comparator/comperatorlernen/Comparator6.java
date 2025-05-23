package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator6 implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1,o2);
    }

    public static void main(String[] args) {
        List<Integer> zahl6 = Arrays.asList(1,4,7,3,2,5,7,4,3,2,3,5,6);

        Collections.sort(zahl6,new Comparator6());

        System.out.println(zahl6);
    }
}
