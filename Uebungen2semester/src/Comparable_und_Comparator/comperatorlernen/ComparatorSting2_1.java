package Comparable_und_Comparator.comperatorlernen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorSting2_1 {
    public static void main(String[] args) {
        List<String> namensliste1 = Arrays.asList("Hans","Alex","Sepp","Maria");

        Collections.sort(namensliste1);

        //System.out.println(namensliste1);

        for (String namen : namensliste1){
            System.out.println(namen);
        }
    }
}
