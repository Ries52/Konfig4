package org.campus02.ecom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EcomDemo {
    public static void main(String[] args) {
        try {
            ArrayList<BasketData> list =BasketLoader.load(".\\data\\buyings.json", new BasketComperator());

//            for (BasketData bd : list) {
//                System.out.println(bd);
//            }
            // System.out.println(list.size());

            BasketAnalyzer ba = new BasketAnalyzer(list);

            List<BasketData>list2 = ba.getEveryNthBasket(2);
            // System.out.println(list2.size());

            List<BasketData>list3 = ba.filterBasket("MasterCard",100.0,200.0);
            //for (BasketData bd : list3){
                // System.out.println(bd);
            //}

            HashMap<String, ArrayList<Double>> erg = ba.groupByProductCategory();
            // System.out.println(erg);

            BasketServerST myServer = new BasketServerST();
            myServer.startServer();



        } catch (DataFileException e) {
            throw new RuntimeException(e);
        }

    }
}
