package com.rakesh.springcoredemo.rest;

import com.rakesh.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

//    @Autowired                                            //this is constructor injection
//    public DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }

    public void setMyCoach(Coach theCoach){                //this is setter injection and it doesn't need to be setter method but works with any naming convention of method because of the autowired annotation
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
