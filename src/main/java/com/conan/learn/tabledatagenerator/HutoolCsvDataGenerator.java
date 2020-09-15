package com.conan.learn.tabledatagenerator;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.text.csv.CsvUtil;
import cn.hutool.core.text.csv.CsvWriter;
import cn.hutool.core.util.CharsetUtil;

import java.util.UUID;

public class HutoolCsvDataGenerator implements TableDataGenerator {
    private CsvWriter writer;
    private String    tempFilePath;

    public HutoolCsvDataGenerator() {
        this.tempFilePath = String.format("D:\\conan\\%s.csv", UUID.randomUUID().toString());
        this.writer = CsvUtil.getWriter(tempFilePath, CharsetUtil.CHARSET_UTF_8);
    }


    @Override
    public void addRow(String... columns) {
        String[] row = new String[columns.length];
        for (int i = 0; i < columns.length; i++) {
            row[i] = columns[i];
        }
        this.writer.write(row);
    }

    @Override
    public void generate(String filePath) throws Exception {
        FileUtil.copy(this.tempFilePath, filePath, true);
    }
}
