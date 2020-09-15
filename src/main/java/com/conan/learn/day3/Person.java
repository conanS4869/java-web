package com.conan.learn.day3;

public interface Person {
    // 字段  public static final  全部大写(static)
    String PERSON_NAME = "lucy";

    //function public abstract  默认。

    String sayHello();

    default String java8New(){
        return "java 8的接口可以写实现了";
    }

}
