package com.huzil.springexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public MyFirstClass myFirstBean() {
        return new MyFirstClass( "First bean");
    }

    @Bean
    public MyFirstClass mySecondBean() {
        return new MyFirstClass( "Second bean");
    }


}
