package com.gregory.springcoredemo.common;

import com.gregory.springcoredemo.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice every day ! :P";
    }
}
