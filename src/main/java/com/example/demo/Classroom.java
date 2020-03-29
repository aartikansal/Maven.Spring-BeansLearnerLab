package com.example.demo;

import java.util.Iterator;

public class Classroom {
    private Instructors instructors;
    private Students students;

public Classroom( Instructors instructors,  Students students )  {
    this.instructors = instructors;
    this.students = students;
}
public void hostLecture(Teacher teacher, double numberOfHours){
    teacher.lecture((Iterator<? extends Learner>) students, numberOfHours);
}

    public Students getStudents() {
        return students;
    }
    public Instructors getInstructors(){
    return instructors;

}
}
