package com.conan.learn.day1;

import java.io.Serializable;

public class Universe implements Serializable {
    private String water;
    private String soil;
    private Creature creature;


    public void survive() {
        System.out.println("Universe survive start!");
        System.out.println("current creature value is : " +
                creature.toString() + ",water :" +
                water + ",soil :" + soil);
        System.out.println("Universe survive stop!");
    }
}
