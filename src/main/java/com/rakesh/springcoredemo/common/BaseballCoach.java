package com.rakesh.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //results in avoiding singleton scope and return false in /check endpoint
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("In Constructor" + getClass().getSimpleName()); //getSimpleName() gives you the name of the class without the package. getName() gives you the name of the class with the full package name in front
    }

    // define our init method
    @PostConstruct
    public void doStartupStuff(){
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }


    // define our destroy method
    @PreDestroy
    public void doCleanupStuff(){
        System.out.println("In doCleanupStuff(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30-mins atleast for batting practice";
    }
}
