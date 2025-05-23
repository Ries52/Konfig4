package org.campus02.lv;

import java.util.ArrayList;


public class ListSortDemo {

    public static void main(String[] args) {

        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student(3,"jk","gg"));
        students.add(new Student(5,"jk","gg"));
        students.add(new Student(2,"jk","gg"));

        //Collections.sort(students);
        System.out.println(students);
    }

}
