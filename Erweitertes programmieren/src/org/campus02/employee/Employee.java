package org.campus02.employee;

public class Employee implements Comparable<Employee> {

    private int empNumber;
    private String name;
    private double sallary;
    private String department;

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(int empNumber, String name, double sallary, String department) {
        this.empNumber = empNumber;
        this.name = name;
        this.sallary = sallary;
        this.department = department;


    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", name='" + name + '\'' +
                ", sallary=" + sallary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        if (this.empNumber<o.empNumber)
//            return 1...............
//        ..........
        return Integer.compare(this.empNumber, o.empNumber);
    }
}
