package com.conan.learn.day4.list.array;

import com.conan.learn.day4.TestDto;
import com.conan.learn.day4.utils.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class RunMain {
    private static List<TestDto> dtoList = new ArrayList<>();
    private static Integer       dtoLen  = 10;

    public static void main(String[] args) {
        // 初始化10个对象放在List里面。
        addElementsToArrayList();
        System.out.println(dtoList.size());
        //for loop按序打印这个容器里的所有元素。
        CollectionUtils.printCollection(dtoList);
        System.out.println("容器里的元素包含了: 1 ,2" + dtoList.contains(new TestDto(1 + "", 2)));
        System.out.println("容器里的元素包含了: 1 ,1" + dtoList.contains(new TestDto(1 + "", 1)));


    }
    //增
    private static void addElementsToArrayList() {
        //声明对象
        TestDto dto = null;
        for (int i = 0; i < dtoLen; i++) {
            //数字变成字符串  + ”“;   任何变量 + ”“ 都会变成字符串。
            //String.valueOf(i);
            //赋值对象。
            dto = new TestDto(i + "", i + 1);
            dtoList.add(dto);
        }
    }


}
