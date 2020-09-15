package com.conan.learn.tabledatagenerator;

public class Test {
    public static void main(String[] args) {
        String path = "out/bcbpcm.csv";
        HutoolCsvDataGenerator generator = new HutoolCsvDataGenerator();
        for (int i = 0; i < 10; i++) {

            try {
                generator.addRow("111"+i,"222"+i,"33"+i,"44"+i);
                generator.generate(path);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
