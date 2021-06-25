package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{


    @Autowired
    private FortuneService fortuneService;

    //Autowired annotation checks if there is a realisation of the interface and automatically injects it to the constructor.
    //Do not forget to mark realisation class with a @Component annotation so Spring could see it

   /*
   @Autowired
    public void setFortuneService(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;

    }*/

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Practice the Tennis today!";
    }
}
