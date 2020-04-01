package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentConfig {

    public static String[] currentStudentsNames = {"Swapna", "Davis", "Julian", "Thao", "Mark", "Katherine",
            "Neela", "Sean M.", "Will", "Delenda", "Joe", "Ashley B.",
            "Laxmi", "Yang", "Aswathy", "Swarthi", "Shuchi", "Cara",
            "Reese", "Sravani", "Cris", "Eric", "Alex", "David",
            "Ashley", "Brian", "David", "Ashley R.", "Brian", "Eleanor",
            "Leah", "Nirmala", "Kyle", "Charlie", "Marlys", "Marshilla",
            "Ajah", "James", "Mike", "Robyn", "Francisco", "Sean R.", "Sunhyun",
            "Arcy", "Zaina", "Kat"};

    public static String[] previousStudentsNames = {"Khalil", "Kevin", "Ned", "Demetrius", "Andrea", "Ray",
            "Eugene", "Allison", "Brandon", "Jon", "Sean", "Connor",
            "Jenn", "Veronica", "Frankie", "Simran", "Chad", "Rachelle",
            "Nafis", "Vince", "April", "Michelle", "Jess", "Xzavia"};

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