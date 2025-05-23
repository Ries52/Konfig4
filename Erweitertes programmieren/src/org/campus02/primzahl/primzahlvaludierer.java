package org.campus02.primzahl;

public class primzahlvaludierer {



    public static void main(String[] args) {
        long zahl1 = 1979990039;
        long zahl2 = 1989990047;
        long zahl3 = 1991990059;
        long zahl4 = 1891999939;
        long zahl5 = 1979990039;
        long zahl6 = 1991999993;



        primzahlfinder2(zahl1);
        primzahlfinder2(zahl2);
        primzahlfinder2(zahl3);
        primzahlfinder2(zahl4);
        primzahlfinder2(zahl5);
        primzahlfinder2(zahl6);

    }

    public static void primzahlfinder2(long zahl1) {
        if (zahl1 <= 1) {
            System.out.println(zahl1 + " ist keine Primzahl.");
            return;
        }

        for (long i = 2; i <= Math.sqrt(zahl1); i++) {
            if (zahl1 % i == 0) {
                System.out.println(zahl1 + " ist keine Primzahl.");
                return;
            }
        }

        System.out.println(zahl1 + " ist eine Primzahl.");
    }

    //public static void primzahlfinder(long zahl1) {
    //
    //        long rest = 0;
    //        long divisor = 2;
    //        for (int i = 0; i < zahl1/2 ; i++){
    //            //System.out.println(zahl1+" "+divisor);
    //            rest = zahl1%divisor;
    //            System.out.println(rest);
    //            if (rest == 0 ){
    //                divisor = divisor*2;
    //            }else {
    //                System.out.println("Keine Primzahl");
    //                break;
    //            }
    //
    //        }
    //    }
}
