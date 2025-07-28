package com.Itheima.exericise;

public class Actor {
    String name;
    int age;
    public Actor() {}
    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        String s = "["+name + " " + age+"]";
        return s;

    }
}
