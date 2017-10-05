package com.example.admin.mylistproject;

/**
 * Created by Admin on 10/3/2017.
 */

public class Person {
    String Name, Age;

    public Person(String name, String age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }
}
