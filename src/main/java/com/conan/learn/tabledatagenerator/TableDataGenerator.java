package com.conan.learn.tabledatagenerator;

public interface TableDataGenerator {
    void addRow(String... columns);

    void generate(String path) throws Exception;
}
