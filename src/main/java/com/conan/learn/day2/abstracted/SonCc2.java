package com.conan.learn.day2.abstracted;

import java.io.Serializable;

public class SonCc2 extends Parent implements Serializable {
    @Override
    public void makeMoney() {
        System.out.println("SonCc2 makeMoney start!");
    }
}
