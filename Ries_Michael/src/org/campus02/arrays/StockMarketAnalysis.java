package org.campus02.arrays;

public class StockMarketAnalysis {
    public static void main(String[] args) {
        double[] aktienpreis = {100.5,98.2,101.3,105.8,102.0,107.6,109.1,104.5,110.3,111.8};
        System.out.println(maxPriceFlutration(aktienpreis));
        System.out.println(maxProfit(aktienpreis));
        System.out.println(counterRisingDays(aktienpreis));

    }

    public static double maxPriceFlutration(double[] prices){


        double zpeichergrößteschwankung= 0;
        for (int i = 0; i<prices.length-1;i++){
            double price1 = prices[i];
            double price2 = prices[i+1];
            double preisschwnkung12 = price1-price2;
            double preisschwnkung21 = price2-price2;

            if (preisschwnkung12<0){  //von Negativ in Positiv
                preisschwnkung12 = preisschwnkung12*(-1);
            }else if (preisschwnkung21<0){
                preisschwnkung21 = preisschwnkung21*(-1);
            }

            if (zpeichergrößteschwankung<preisschwnkung12){
                zpeichergrößteschwankung= preisschwnkung12;
            }else if (zpeichergrößteschwankung<preisschwnkung21){
                zpeichergrößteschwankung=preisschwnkung21;
            }
        }

        return zpeichergrößteschwankung;
    }
    public static  double maxProfit(double[] prices){

        double zwischenspeicherkleinstes = prices[0];
        double zwischenspeichergrößte = prices[0];
        for (int i = 0 ; i<prices.length;i++){
            double zwischenspeicher = prices[i];

            if (zwischenspeicherkleinstes>zwischenspeicher){
                zwischenspeicherkleinstes = zwischenspeicher;
            }
            if (zwischenspeichergrößte<zwischenspeicher){
                zwischenspeichergrößte=zwischenspeicher;
            }
        }
        if (zwischenspeichergrößte==0||zwischenspeicherkleinstes==0){
            return 0;
        }
        return zwischenspeichergrößte-zwischenspeicherkleinstes;
    }
    public static  int counterRisingDays(double[] prices){
        int counter = 0;
        for (int i =0 ; i<prices.length-1;i++){
            double price1 = prices[i];
            double price2 = prices[i+1];
            if (price1<price2){
                counter+=1;
            }
        }
        return counter;
    }
}
