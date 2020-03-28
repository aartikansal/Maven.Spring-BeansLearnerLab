package com.example.demo;

import java.util.Iterator;

public abstract class Instructor extends Person implements Teacher{

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);

    }

    @Override
    public void lecture(Iterator<? extends Learner> learners, double numberOfHours) {
        learners.next().learn(numberOfHours);

    }
}

