package com.rakesh.springcoredemo.rest;

import com.rakesh.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;                                  //Field Injection: if constructor or setters are not used than it's left with this line alone it's called Field injection
    private Coach anotherCoach;
    @Autowired                                            //this is constructor injection
    public DemoController(@Qualifier("swimCoach") Coach theCoach,
                          @Qualifier("swimCoach") Coach theAnotherCoach){ //singleton scope referring to same bean
        System.out.println("In Constructor" + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

//    @Autowired                                            //this is constructor injection
//    public DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }

//    public void setMyCoach(Coach theCoach){                //this is setter injection and it doesn't need to be setter method but works with any naming convention of method because of the autowired annotation
//        myCoach = theCoach;
//    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}
