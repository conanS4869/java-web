package com.conan.learn.day1;

import java.io.Serializable;

public class Earth extends Universe implements Serializable {
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Earth{" +
                "person=" + person +
                '}';
    }
}
