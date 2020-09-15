package com.conan.learn.day4;

import java.io.Serializable;
import java.util.Objects;

public class TestDto implements Serializable {
    private String  name;
    private Integer age;

    public TestDto() {
    }

    public TestDto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestDto testDto = (TestDto) o;
        return Objects.equals(name, testDto.name) &&
                Objects.equals(age, testDto.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
