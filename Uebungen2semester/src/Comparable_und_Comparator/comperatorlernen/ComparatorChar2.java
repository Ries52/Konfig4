package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorChar2 implements Comparator<Character> {
    @Override
    public int compare(Character o1, Character o2) {
        return o1.compareTo(o2);
    }

    public static void main(String[] args) {
        List<Character> charlist2 = Arrays.asList('b','a','d','c','e');

        Collections.sort(charlist2,new ComparatorChar2());

        System.out.println(charlist2);
    }
}
