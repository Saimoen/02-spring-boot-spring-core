package com.gregory.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
@Component
public class BasketCoach implements Coach {
    public BasketCoach() {
        System.out.println("In constructor" + getClass().getSimpleName());
    }

    // define our init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("Initialisation du bean : " + getClass().getSimpleName());
    }

    // define our destroy method
    @PreDestroy
    public void doMyDestroyStuff() {
        System.out.println("Destruction du bean : " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Basketball 4 life !";
    }
}
