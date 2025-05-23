package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator4 implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1,o2);
    }

    public static void main(String[] args) {
        List<Integer> zahl4 = Arrays.asList(1,9,2,7,3,6,4,3,3,5,8,8,8);
        List<Integer> zahl41 = Arrays.asList(1,3,3,5,7,4,32,2,34,4,6);

        Collections.sort(zahl4,new comparator4());
        System.out.println(zahl4);

        Collections.sort(zahl41,new comparator4());
        System.out.println(zahl41);
    }
}
