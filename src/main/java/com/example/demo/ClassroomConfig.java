package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class ClassroomConfig {
        @Autowired
        private StudentConfig studentConfig;

        @Autowired
        private InstructorsConfig instructorsConfig;

        @Bean(name = "currentCohort")
        public Classroom currentCohort(){
            return new Classroom(instructorsConfig.zcwInstructors(), studentConfig.currentStudents());
        }

        @Bean(name = "previousCohort")
        public Classroom previousCohort(){
            return new Classroom(instructorsConfig.zcwInstructors(), studentConfig.previousStudents());
        }
    }


