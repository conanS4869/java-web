package com.conan.learn.day4.utils;

import java.util.Collection;

public class CollectionUtils {
    public static void printCollection(Collection collection) {
        collection.forEach(c->{
            System.out.println(c);
        });
    }
}
