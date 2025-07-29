package com.Itheima.execrise;

import java.io.File;

public class Exericise3 {



            /* public long length()  返回文件的大小(字节数量)
            public String getAbsolutePath()返回文件的绝对路径
            public String getPath()返回定义文件时使用的路径
            public String getName()返回文件的名称,带后缀
            public long lastModified()返回文件的最后修改时间(时间毫秒值)*/
            public static void main(String[] args) {
                System.out.println("-------------------length()  返回文件的大小(字节数量)----------------------");
                File file1=new File("D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\Exericise1.java");
                System.out.println(file1.length());

                System.out.println("-------------------getAbsolutePath()返回文件的绝对路径----------------------");

                File file2=new File("Exericise2.java");
                System.out.println(file2.getAbsoluteFile());

                System.out.println("-------------------getPath()返回定义文件时使用的路径----------------------");
                System.out.println(file1.getPath());
                System.out.println(file2.getPath());
                System.out.println("-------------------getPath()返回定义文件时使用的路径----------------------");
                System.out.println(file1.getName());
                System.out.println("-------------------lastModified()返回文件的最后修改时间(时间毫秒值)----------------------");
                System.out.println(file1.lastModified());
            }




    //返回文件的大小(字节数量)
    //细节1:这个方法只能获取文件的大小,单位是字节
    //如果单位我们要是M,G,可以不断的除以1024
    //细节2:这个方法无法获取文件夹的大小
    //如果我们要获取一个文件夹的大小,需要把这个文件夹里面所有的文件大小都累加在一起。





}
