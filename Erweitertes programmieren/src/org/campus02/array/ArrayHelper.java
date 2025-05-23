package org.campus02.array;

import java.util.Arrays;

public class ArrayHelper {

    public static void main(String[] args) {
        Car[] arr = {
                new Car(2024,"PKW",12999),
                new Car(2023,"PKW",12999),
                new Car(2022,"PKW",12999),
        };

        System.out.println(Arrays.toString(arr));

        arrangeorder(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void arrangeorder(Car[]number){

        for (int j = 0; j < number.length;j++){
            boolean swapped = false;
            for (int i = 0 ; i<number.length-1-j;i++){
            if (number[i].getPrductionYear()> number[i+1].getPrductionYear()){

                Car temp = number[i];
                number[i] = number[i+1];
                number[i+1]= temp;
                swapped = true;
            }
            }
            if (!swapped)
                break;
        }
    }
}
