package org.campus02.lv;


public class Student implements Comparable<Student> {

    private int matrNr;
    private String firstName;
    private String lastname;

    public Student(int matrNr, String firstName, String lastname) {
        this.matrNr = matrNr;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public int getMatrNr() {
        return matrNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrNr=" + matrNr +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }



    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.matrNr, this.matrNr);
    }
}
