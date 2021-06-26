package com.spring.appsConfigurations;

import com.spring.interfaces.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApp {

    public static void main(String[] args){


        //Here is a new way to configure the Spring application
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        theCoach.getEmail();

        context.close();
    }
}