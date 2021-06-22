package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/spring/applicationContext.xml");

        Coach theCoach = context.getBean("tennis", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}

