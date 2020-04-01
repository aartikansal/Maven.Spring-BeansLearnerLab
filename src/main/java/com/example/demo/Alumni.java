package com.example.demo;

;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

    @Component
    public class Alumni {
        private Students students;
        private Instructors instructors;

        @Autowired
        public Alumni(@Qualifier("previousStudents") Students students, Instructors instructors) {
            this.students = students;
            this.instructors = instructors;
        }

        @PostConstruct
        public void executeBootcamp(){
            int numberOfInstructors = instructors.size();
            int numberOfStudents = students.size();
            double numberOfHoursToTeachEachStudent = 1200;
            double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
            double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;
            instructors.forEach(instructor -> instructor.lecture(students, numberOfHoursPerInstructor));
        }

        public Students getStudents() {
            return students;
        }

        public Instructors getInstructors() {
            return instructors;
        }
    }

