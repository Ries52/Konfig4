package org.campus02.lv;

import java.util.Arrays;

public class ArraySortDemo {

    public static void main(String[] args) {
        int[] numbers = {2,3,4,5,7,8,9,1};
        for (int i : numbers){
            System.out.println(i);
        }

        System.out.println(numbers[0]);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);

        char[] chars ={'v','f','g','a'};
        System.out.println(chars[0]);
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        System.out.println(chars[0]);

        String[] strings= {"hallo","wie","geht","es","dir"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        Student[] students= {
                new Student(2,"Hans","Maier"),
                new Student(4,"Hans","Maier"),
                new Student(8,"Hans","Maier")
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
