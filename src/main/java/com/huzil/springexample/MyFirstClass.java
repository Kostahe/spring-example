package com.huzil.springexample;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyFirstClass {

    public String sayHello() {
        return "Hello World";
    }
}
