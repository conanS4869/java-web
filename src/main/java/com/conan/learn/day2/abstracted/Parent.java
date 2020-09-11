package com.conan.learn.day2.abstracted;

import java.io.Serializable;

public abstract class  Parent implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.println("hi!");
    }

    public abstract void makeMoney();

}
