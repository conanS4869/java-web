package com.conan.learn.tabledatagenerator;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;

public class SimpleCSVDataGenerator implements TableDataGenerator {
    private String text = "";
    @Override
    public void addRow(String... columns) {
        for (String column : columns) {
            text += column.replaceAll("\"", "\"\"") + ",";
        }
        text = StringUtils.removeEnd(text, ",");
        text += "\r\n";
    }

    @Override
    public void generate(String path) throws Exception {
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        FileUtils.writeStringToFile(new File(path),text,"UTF-8");
    }
}
