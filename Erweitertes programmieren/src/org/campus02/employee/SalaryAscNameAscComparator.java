package org.campus02.employee;

import java.util.Comparator;

public class SalaryAscNameAscComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int result = Double.compare(o1.getSallary(),o2.getSallary());
        if (result != 0 ){
            return result;
        }
        return 0;
    }


    //    @Override
//    public int compare(Employee o1, Employee o2) {
//        int result = o1.getDepartment().compareTo(o2.getDepartment());
//        if (result==0){
//            return o2.getName().compareTo(o1.getName());
//        }
//        return result;
//    }
}
