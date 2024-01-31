package com.gregory.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class BasketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Basketball 4 life !";
    }
}
