package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.List;

public class UngeradeZuerst5 {
    public static void main(String[] args) {
        List<Integer> zahl5 = Arrays.asList(1,3,4,5,6,3,9,2,4,5,5,6,4);

        zahl5.sort((a,b)->{
            if (a%2 != b%2){
                return (a%2 ==0 ) ? 1: -1;
            }
            return Integer.compare(a,b);
        });
        System.out.println(zahl5);
    }
}
