package com.conan.learn.day2.abstracted;

import java.io.Serializable;

public class SonCc1 extends Parent implements Serializable {
    @Override
    public void makeMoney() {
        System.out.println("SonCc1 makeMoney start!");
    }
}
