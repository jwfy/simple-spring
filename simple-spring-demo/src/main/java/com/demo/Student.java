package com.demo;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by junhong on 18/1/7.
 */
public class Student {

    @Value("${name}")
    private String className;

    private String name;

    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
        System.out.println("constructor loading");
    }

    public void init(){
        System.out.println("init loading");
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
