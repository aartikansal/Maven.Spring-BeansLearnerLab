package com.example.demo;

import java.util.ArrayList;

public class Instructor extends Person implements Teacher{
    private Double numberOfHoursTaught;

    public Instructor(Long id, String name) {
        super(id, name);
        numberOfHoursTaught = 0d;
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
        numberOfHoursTaught += numberOfHours;
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
        ArrayList<Learner> learnersList = new ArrayList<>();
        learners.forEach(learner -> learnersList.add(learner));
        for(Learner learner: learners){
            learner.learn(numberOfHours / learnersList.size());
        }
        numberOfHoursTaught += numberOfHours;
    }

    public Double getNumberOfHoursTaught() {
        return numberOfHoursTaught;
    }
}