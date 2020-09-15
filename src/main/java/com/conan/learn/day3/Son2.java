package com.conan.learn.day3;

public class Son2 implements Person {
    private String son2Name = "son2";
    @Override
    public String sayHello() {
        return Person.PERSON_NAME + son2Name;
    }
}
