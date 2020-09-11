package com.conan.learn.day2;

public class WhatClass {
    private String name1 = "sherry";
    /**
     * 创建一个对象引用 ----> 声明一个对象的引用。
     *
     * String name ====> String name = null;
     * 这是空。
     */
    private String name;

    private int    num;

    public WhatClass() {
    }

    /**
     *
     * @param name
     */
    public WhatClass(String name) {
        this.name = name;
    }

    public WhatClass(Integer num) {
        this.num = num;
    }

    public WhatClass(String name, Integer num) {

    }
    /**
     * public
     */
    public class Person0 {

    }

    /**
     *  default
     *
     * 类前面什么都没有，访问修饰符为default.
     */
    class Person {

    }

    /**
     * protected
     */
    protected class Person2 {

    }

    /**
     * private
     */
    private class InnerPerson {
    }

    public static void main(String[] args) {
        WhatClass whatClass = new WhatClass();
        //set num 这个属性之前的值为：
        System.out.println("set num 这个属性之前的值为" + whatClass);
        whatClass.setNum(1997);
        System.out.println("set num 这个属性之前的值为" + whatClass);
        System.out.println("=============================================");
        /**
         * 有参的构造对象。
         */

        WhatClass whatClass1 = new WhatClass("conan");
        System.out.println(whatClass1);

    }

    private void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "WhatClass{" +
                "name1='" + name1 + '\'' +
                ", name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
