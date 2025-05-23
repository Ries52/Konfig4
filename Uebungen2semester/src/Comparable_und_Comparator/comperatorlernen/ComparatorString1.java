package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorString1 implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

    public static void main(String[] args) {
        List<String> stinglist1 = Arrays.asList("Hans","Sepp","Franz","Alex");

        Collections.sort(stinglist1,new ComparatorString1());
        System.out.println(stinglist1);
    }
}
