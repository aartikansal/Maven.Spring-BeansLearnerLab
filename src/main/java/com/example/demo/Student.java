package com.example.demo;

public class Student extends Person implements Learner{
    private Double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
        totalStudyTime = 0D;
    }

    @Override
    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}