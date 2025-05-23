package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.List;

public class UngeradeZuerst4 {
    public static void main(String[] args) {
        List<Integer> zahl4 = Arrays.asList(1,4,6,7,4,3,2,2);

        zahl4.sort((a,b)->{
            if (a%2 != b%2){
                return (a%2 ==0) ? 1:-1;
            }
            return Integer.compare(a,b);
        });
        System.out.println(zahl4);
    }
}
