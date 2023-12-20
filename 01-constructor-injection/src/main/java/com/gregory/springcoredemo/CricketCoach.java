package com.gregory.springcoredemo;

import org.springframework.stereotype.Component;

// Annotation marks the class as a Spring bean
@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice coast to coast for 15 minutes. NOW!!";
    }
}
