package com.example.admin.mylistproject;

/**
 * Created by Admin on 10/4/2017.
 */

public class Person2 {
    private String name, surname;

    public Person2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}