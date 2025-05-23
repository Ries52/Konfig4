package org.campus02.lv;

import java.util.Arrays;

public class Übung {
    public static void main(String[] args) {
        int[] in= {1,4,8,3,6,9};
        String[] strin= {"dfs","gh","HN"};

        System.out.println(in[0]);
        Arrays.sort(in);
        System.out.println(Arrays.toString(in));
        System.out.println(in[0]);


        System.out.println(strin[0]);
        Arrays.sort(strin);
        System.out.println(Arrays.toString(strin));
        System.out.println(strin[0]);

    }
}
