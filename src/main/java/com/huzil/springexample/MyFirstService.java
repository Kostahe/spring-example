package com.huzil.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private MyFirstClass myFirstClass;

    @Autowired
    public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }


    public String tellAsStory() {
        return "The depency said: " + myFirstClass.sayHello();
    }
}
