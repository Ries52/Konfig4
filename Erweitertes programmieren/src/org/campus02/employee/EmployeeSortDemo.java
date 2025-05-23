package org.campus02.employee;

import java.util.Arrays;

public class EmployeeSortDemo {

    public static void main(String[] args) {

        Employee[] employees= {
                new Employee(5,"bax",43.55,"df"),
                new Employee(6,"aax",43.55,"df"),
                new Employee(1,"cax",43.55,"df"),

        };

        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new SalaryDescComparator());
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new DepartmentAscNameDescComparator() );
        System.out.println(Arrays.toString(employees));
    }
}
