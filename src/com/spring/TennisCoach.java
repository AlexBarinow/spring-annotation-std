package com.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennis")
@Scope("prototype")
public class TennisCoach implements Coach{


    public  TennisCoach(){
        System.out.println("constructor worked");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice the Tennis today!";
    }
}
