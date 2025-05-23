package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.List;

public class UngeradeZuerst6 {

    public static void main(String[] args) {
        List<Integer>zahlenungerade6 = Arrays.asList(1,3,7,3,6,4,2,3,5,6,8,9,4,2);

        zahlenungerade6.sort((a,b)->{
            if (a%2 != b%2){
                return (a%2 == 0) ? 1 : -1;
            }
            return Integer.compare(a,b);
        });

        System.out.println(zahlenungerade6);
    }
}
