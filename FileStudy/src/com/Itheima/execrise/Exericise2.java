package com.Itheima.execrise;

import java.io.File;

public class Exericise2 {

    public static void main(String[] args) {
        String testPath1="D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\Exericise1.java";
        File file1=new File(testPath1);
        String testPath2="D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise";
        File file2=new File(testPath2);
        String testPath3="D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\sdasx";
        File file3=new File(testPath3);


        System.out.println("1.");
        System.out.println(file1.exists());
        System.out.println(file2.exists());
        System.out.println(file3.exists());

        System.out.println("2.");

        System.out.println(file1.isFile());
        System.out.println(file2.isFile());
        System.out.println(file3.isFile());

        System.out.println("3.");
        System.out.println(file1.isDirectory());
        System.out.println(file2.isDirectory());
        System.out.println(file3.isDirectory());

    }


}
