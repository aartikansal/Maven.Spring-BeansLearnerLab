package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentConfig {

    public static String[] currentStudentsNames = {"April", "David", "Chris", "Sandy", "Maurice", "Leila",
            "Giles", "Dave",  "Sandeep", "Corey", "Aarti",
            "Raheel","James", "Ujjwal", "Emily", "Destiny",
            "Zeth", "Jimmy", "Matt", "Zenetta", "Kevin", "Han",
            "Von", "Jeremy", "Khalil", "Greg", "Adam",};

    public static String[] previousStudentsNames = {"Joshina ", "Kevina", "Maggie", "Amy", "Andy", "Gratia",
            "Josh", "Usha", "barb", "anish", "Yatig", "Sandy",
            "Jen", "Vero", "Fran", "Simran", "Chad", "Rachin",
            "Nafy", "Vincent", "Amin", "Michael", "Jessica", "Dave"};

    @Bean(name = "currentStudents")
    public Students currentStudents(){
        ArrayList<Student> currentStudentsList = new ArrayList<>();
        for (int i = 0; i < currentStudentsNames.length; i++) {
            currentStudentsList.add(new Student((long) i, currentStudentsNames[i]));
        }
        return new Students(currentStudentsList);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        ArrayList<Student> previousStudentsList = new ArrayList<>();
        for (int i = 0; i < previousStudentsNames.length; i++) {
            previousStudentsList.add(new Student((long) i, previousStudentsNames[i]));
        }
        return new Students(previousStudentsList);
    }
}