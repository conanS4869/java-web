package com.conan.learn.csvgenerator;

public class CSV {
    private String text = "";

    public CSV() {
        this.text = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addLine(String... strings) {
        text += String.join(",", strings);
        text += "\r\n";
    }
}
