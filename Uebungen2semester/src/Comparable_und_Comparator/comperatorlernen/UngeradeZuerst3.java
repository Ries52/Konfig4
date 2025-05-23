package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.List;

public class UngeradeZuerst3 {
    public static void main(String[] args) {
        List<Integer> zahlen3 = Arrays.asList(1,7,2,5,3,4,4,3,3,6,7,8,9,2);

        zahlen3.sort((a,b)->{
            if (a%2 != b%2){
                return (a%2 == 0) ? 1:-1;
            }
            return Integer.compare(a,b);
        });
        System.out.println(zahlen3);
    }
}
