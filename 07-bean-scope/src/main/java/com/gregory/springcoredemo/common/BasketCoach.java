package com.gregory.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BasketCoach implements Coach {
    public BasketCoach() {
        System.out.println("In constructor" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Basketball 4 life !";
    }
}
