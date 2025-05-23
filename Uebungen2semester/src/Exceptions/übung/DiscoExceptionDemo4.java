package Exceptions.übung;

import java.util.Arrays;
import java.util.List;

public class DiscoExceptionDemo4 {
    public static void main(String[] args) {

        List<Integer> alterpersonen = Arrays.asList(26,16,23,23,43,19,18,19,17);

            for (int peron : alterpersonen){
                alterskontrolle(peron);
            }

    }
    public static void alterskontrolle(int alter){
        try {
            System.out.println(altererlaubt(alter));
        }catch (MeineDicoException e){
            System.out.println("noch nicht alt genug ");
        }finally {
            System.out.println("nächste Person:");
        }
    }

    public static int altererlaubt(int alter){
        if (alter<18){
            throw new MeineDicoException("noch nicht alt genung",alter);
        }
        return alter;
    }
}
