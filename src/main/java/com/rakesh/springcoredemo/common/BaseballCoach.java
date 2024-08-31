package com.rakesh.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("In Constructor" + getClass().getSimpleName()); //getSimpleName() gives you the name of the class without the package. getName() gives you the name of the class with the full package name in front
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30-mins atleast for batting practice";
    }
}
