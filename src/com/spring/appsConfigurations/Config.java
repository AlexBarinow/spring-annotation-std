package com.spring.appsConfigurations;


import com.spring.beans.HappyFortuneService;
import com.spring.beans.TennisCoach;
import com.spring.interfaces.Coach;
import com.spring.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:com/spring/data.properties")
@ComponentScan("com.spring")
public class Config {



    @Bean
    public FortuneService myHappyFortuneService(){
        return new HappyFortuneService();
    }


    @Bean
    public Coach tennisCoach(){

        return new TennisCoach(myHappyFortuneService());
    }


}
