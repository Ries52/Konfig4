package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorChar1 {
    public static void main(String[] args) {
        List<Character> charlist = Arrays.asList('b','a','c','e','d');

        Collections.sort(charlist);
        System.out.println(charlist);

        Collections.sort(charlist,Collections.reverseOrder());
        System.out.println(charlist);
    }
}
