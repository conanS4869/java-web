package com.conan.learn.csvgenerator;

import java.io.IOException;

public class TestCSVGenerator {
    public static void main(String[] args) {
        CSVGenerator csvGenerator = new CSVGenerator();
//        生成n行数据
        csvGenerator.setCsv(1000);
        try {
            csvGenerator.toFile("out/csv2020.csv");
            System.out.println("csvGenerator done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
