package com.huzil.springexample;

public class MyFirstClass {

    private final String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello() {
        return "Hello World from MyFirstClass ===> " + myVar;
    }
}
