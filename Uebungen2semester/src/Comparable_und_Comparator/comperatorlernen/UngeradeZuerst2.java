package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.List;

public class UngeradeZuerst2 {
    public static void main(String[] args) {
        List<Integer> zahl2 = Arrays.asList(1,6,2,6,5,2,3,4,5,7,8,9);

        zahl2.sort((a,b) -> {
            if (a%2 != b%2){
                return (a%2 ==0) ? 1:-1;
            }
            return Integer.compare(a,b);
        });
        System.out.println(zahl2);
    }
}
