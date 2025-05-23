package org.campus02.file.objektoutputdemo;

import java.io.Serializable;

public class Person implements Serializable {

    private String firstname;
    private String lastname;
    private int number;

    public Person(String firstname, String lastname, int number) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.number = number;
    }
}
