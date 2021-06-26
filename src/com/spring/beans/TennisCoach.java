package com.spring.beans;

import com.spring.interfaces.Coach;
import com.spring.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {


    @Autowired
    @Qualifier("HFS")
    private FortuneService fortuneService;


    @Value("${email}")
    private String email;

    @Override
    public void getEmail() {
        System.out.println(email);
    }

    public TennisCoach(FortuneService happyFortuneService){
        this.fortuneService=happyFortuneService;

        System.out.println("Constructor of tennis coach has worked");
    }

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
