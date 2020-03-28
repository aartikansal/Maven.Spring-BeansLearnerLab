package com.example.demo;

import java.util.Iterator;

public interface Teacher {
    public void teach(Learner learner, double numberOfHours);

    public void lecture (Iterator<? extends Learner>learners, double numberOfHours);
}
