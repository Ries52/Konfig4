package org.campus02.cart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CartSortDemo {

    public static void main(String[] args) {

        ArrayList<Cart> carts= new ArrayList<>();
        carts.add(new Cart("vw", 4,34,235.99));
        carts.add(new Cart("audi", 4,34,235.99));
        carts.add(new Cart("ford", 4,34,235.99));

        Collections.sort(carts);
        System.out.println(carts);

//        Collections.sort(carts, new CartTotalItemsDescComparator());
//        System.out.println(carts);
    }
}
