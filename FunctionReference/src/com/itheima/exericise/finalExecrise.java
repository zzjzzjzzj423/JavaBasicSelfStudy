package com.itheima.exericise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class finalExecrise {


    public static void main(String[] args) {
        System.out.println("---------------execrise1-------------------");
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"张三,23","李四,24","金成武,25","林思广,26","周子健,27","和曾光,28");
        Student[] s1=list1.stream().map(Student::new).toArray(Student[]::new);
        for(Student s:s1){
            System.out.println(s);
        }

        System.out.println("---------------execrise2-------------------");
        ArrayList<Student> list2=new ArrayList<>();
        Student student1=new Student("周子健,22");
        list2.add(student1);
        Student student2=new Student("胡晨薇,20");
        list2.add(student2);
        Student student3=new Student("猫猫猫,1");
        list2.add(student3);
        String[] array2=list2.stream()
                .map(new Student()::getNameFromStuInfo)
                        .toArray(String[]::new);

        for(String s:array2){
            System.out.println(s);
        }


        System.out.println("---------------execrise3-------------------");
        String[] array3=list2.stream().map(new Student()::combineStudent).toArray(String[]::new);
        for(String s:array3){
            System.out.println(s);
        }

    }
}
