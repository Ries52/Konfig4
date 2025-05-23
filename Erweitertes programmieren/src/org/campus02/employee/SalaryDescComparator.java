package org.campus02.employee;

import java.util.Comparator;

public class SalaryDescComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.getSallary(),o1.getSallary());
    }
}
