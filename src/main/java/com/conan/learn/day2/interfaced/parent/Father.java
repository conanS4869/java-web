package com.conan.learn.day2.interfaced.parent;
/**
 * 接口里的字段默认是 public static final ,所以需要初始化。
 *
 */

public interface Father {
    public static final String fatherName  = "father";

    String                     fatherName2 = "father2";

    void callFather();

    void callFather2();


}
