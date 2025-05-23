package org.campus02.recursion;

public class RecursiveHelper {
    public static void main(String[] args) {
        int[] array = {3,5,2,8,1};
        System.out.println(sumArray(array,5));
        int[] array2 = {};
        System.out.println(sumArray(array2,0));
    }
    public static  int sumArray(int[] numbers,int index){

        if (index <=0){
            return 0;
        }
        index = index-1;

        return sumArray(numbers,index)+numbers[index];
    }
}
