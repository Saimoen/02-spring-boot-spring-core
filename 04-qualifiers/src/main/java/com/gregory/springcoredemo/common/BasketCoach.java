package com.gregory.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Basketball 4 life !";
    }
}
