package com.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("HFS")
@Scope("prototype")
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {

        return "Today is your lucky day!";
    }
}
