package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Instructor extends Person implements Teacher {
    private Double numberOfHoursTaught;

    public Instructor(long id, String name) {
        super(id, name);
        numberOfHoursTaught = 0d;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);

    }

    @Override
    public void lecture(Iterator<? extends Learner> learners, double numberOfHours) {
        ArrayList<Learner> learnersList = new ArrayList<>();
        learners.forEachRemaining(learner -> learnersList.add(learner));
        for (Iterator<? extends Learner> it = learners; it.hasNext(); ) {
            Learner learner = it.next();
            learner.learn(numberOfHours / learnersList.size());
        }
        numberOfHoursTaught += numberOfHours;
    }

    public Double getNumberOfHoursTaught() {
        return numberOfHoursTaught;

    }
}
