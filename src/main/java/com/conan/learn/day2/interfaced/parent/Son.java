package com.conan.learn.day2.interfaced.parent;

public class Son implements Father,FatherMark {

    @Override
    public void callFather() {
        System.out.println("Son call father");
    }

    @Override
    public void callFather2() {
        System.out.println("Son call father 2");
    }
}
