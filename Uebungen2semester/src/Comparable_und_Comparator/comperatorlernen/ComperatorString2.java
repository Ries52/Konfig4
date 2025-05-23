package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComperatorString2 implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

    public static void main(String[] args) {
        List<String> stringList2= Arrays.asList("Sepp","Alex","Maria","Peter","Michi");

        Collections.sort(stringList2,new ComperatorString2());

        System.out.println(stringList2);
    }
}
