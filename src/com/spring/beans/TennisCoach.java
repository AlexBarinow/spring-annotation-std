package com.spring.beans;

import com.spring.interfaces.Coach;
import com.spring.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {


    @Autowired
    @Qualifier("HFS")
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
    @PostConstruct
    public void preRun() {
        System.out.println("this is what happens when you call the pre method");
    }

    @Override
    @PreDestroy
    public void afterRun() {
        System.out.println("this is what happens when you call the after method");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice the Tennis today!";
    }
}
