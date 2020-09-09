package com.conan.learn.day1;

import java.io.Serializable;

public class Mars extends Universe implements Serializable {
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Mars{" +
                "person=" + person +
                '}';
    }
    public void volcanicEruptions() {
        System.out.println("火山爆发！");
    }

}
