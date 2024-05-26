package com.huzil.springexample;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MyFirstClass myFirstClass;

    public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellAsStory() {
        return "The depency said: " + myFirstClass.sayHello();
    }
}
