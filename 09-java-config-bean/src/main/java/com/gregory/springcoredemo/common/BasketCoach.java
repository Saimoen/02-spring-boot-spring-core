package com.gregory.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
@Component
public class BasketCoach implements Coach {
    public BasketCoach() {
        System.out.println("In constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Basketball 4 life !";
    }
}
