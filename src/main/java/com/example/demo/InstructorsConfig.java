package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

@Configuration
public class InstructorsConfig {

    public static String[] tcUsaNames = {"Alex", "Brian", "Charlie"};
    public static String[] tcUKNames = {"Alfred", "Boxwell", "Chadwick"};
    public static String[] zcwNames = {"Kris", "Froilan", "Leon", "Wilhem", "Dolio", "Nhu"};

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors(){
        ArrayList<Instructor> instructors = new ArrayList<>();
        for (int i = 0; i < tcUsaNames.length; i++) {
            instructors.add(new Instructor((long) i, tcUsaNames[i]));
        }
        return new Instructors(instructors);
    }

    @Bean(name = "tcUKInstructors")
    public Instructors tcUKInstructors(){
        ArrayList<Instructor> instructors = new ArrayList<>();
        for (int i = 0; i < tcUKNames.length; i++) {
            instructors.add(new Instructor((long) i, tcUKNames[i]));
        }
        return new Instructors(instructors);
    }

    @Primary
    @Bean(name = "zcwInstructors")
    public Instructors zcwInstructors(){
        ArrayList<Instructor> instructors = new ArrayList<>();
        for (int i = 0; i < zcwNames.length; i++) {
            instructors.add(new Instructor((long) i, zcwNames[i]));
        }
        return new Instructors(instructors);
    }
}