package com.conan.learn.day1;

import java.io.Serializable;

public class Person implements Serializable {
    private String perName;

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "perName='" + perName + '\'' +
                '}';
    }
}
