package com.conan.learn.day3;

public class RunMain {
    /**                             引用作用逐级递减。
     * new Object();                 |
     * 1. 强引用    ====> jvm         |
     * 2. 软引用                      |
     * 3. 虚引用                      |
     * 4. 幻影引用。                  |
     *                              v
     * @param args
     */

    public static void main(String[] args) {
        Person person = new Son1();

        Person son1 = person;

        System.out.println(person.sayHello());
        System.out.println("===================================");

        person = new Son2();
        System.out.println(person.sayHello());

        System.out.println("====================================");
        System.out.println(son1.sayHello());
        /**
         * 多态运用的是重写，而不能直接使用重载。
         * 因为多态这种父类引用指向子类对象的方式只能在运行期确定对象真正的种类。
         * 故：多态无法使用重载，天然支持重写。
         */
        Son1 son11 = new Son1();
        System.out.println(son11.sayHello("123"));


    }
}
