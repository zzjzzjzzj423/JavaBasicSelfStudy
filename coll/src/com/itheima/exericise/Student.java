package com.itheima.exericise;

import java.util.Objects;

class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(){

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public Student(String stuInfo){

        String[] info = stuInfo.split(",");
        this.name = info[0];
        this.age = Integer.parseInt(info[1]);
    }

    public String getNameFromStuInfo(Student student) {

        return student.name;
    }

    public String combineStudent(Student student) {
        return student.name + "-" + student.age;
    }

    @Override
    public String toString() {

        return "[name=" + name + ", age=" + age + "]";
    }


    //对象作为键需要重写hashcode以及equals方法
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student s) {
            return s.name.equals(this.name)&&s.age == this.age;
        }else {
            return false;
        }

    }

    @Override
    public int compareTo(Student o) {

        return 0;
    }
}