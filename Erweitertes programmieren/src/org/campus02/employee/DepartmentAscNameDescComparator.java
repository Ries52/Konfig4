package org.campus02.employee;

import java.util.Comparator;

public class DepartmentAscNameDescComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int result = o1.getDepartment().compareTo(o2.getDepartment());
        if (result==0){
            return o2.getName().compareTo(o1.getName());
        }
        return result;
    }
}
