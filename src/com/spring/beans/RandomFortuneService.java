package com.spring.beans;

import com.spring.interfaces.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("rand")
public class RandomFortuneService implements FortuneService {

    private String[] rand = {

            "Some kind of stuff",
            "just a random",
            "The end"
    };


    @Override
    public String getFortune() {
        return rand[new Random().nextInt(rand.length)];
    }
}