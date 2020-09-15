package com.conan.learn.day3;

public class Son1 implements Person{

    private String userName = "我是 son1";
    @Override
    public String sayHello() {
        return Person.PERSON_NAME + userName;
    }
    /**
     * 同一个类提供同一行为的不同输出。
     *
     * 重载：方法名一样，参数不同。
     * @param name
     * @return
     */
    public String sayHello(String name) {
        // null  "    "   空跟空串的区别。
        if (null == name || "".equals(name)) {
            //            return this.sayHello();
            return Person.PERSON_NAME + userName;
        }
        //        return Person.PERSON_NAME + userName + "xxxxx";
        return this.sayHello() + "xxxx";
    }

}
