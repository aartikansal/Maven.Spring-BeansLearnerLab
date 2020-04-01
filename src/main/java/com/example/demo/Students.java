package com.example.demo;


import java.util.List;

public class Students extends People<Student>{
    public Students(List<Student> personList) {
        super(personList);
    }
}