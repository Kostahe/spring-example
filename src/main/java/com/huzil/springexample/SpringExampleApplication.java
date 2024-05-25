package com.huzil.springexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringExampleApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(SpringExampleApplication.class, args);

        MyFirstService myFirstService = context.getBean(MyFirstService.class);
        System.out.println(myFirstService.tellAsStory());
    }
}
