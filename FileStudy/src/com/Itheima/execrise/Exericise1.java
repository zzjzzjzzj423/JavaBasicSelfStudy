package com.Itheima.execrise;

import java.io.File;

public class Exericise1 {
    /*
    * public File(String Pathnaem)   根据文件路径创建对象
    * public File(String parent, String child) 根据父路径创建文件
    * Public File(File parent, String child)  根据父路径对应的文件对象和子路径名字字符串创建文件对象
    *
    * */

    public static void main(String[] args) {
        String path="D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\a.txt";
        File file=new File(path);
        System.out.println(file);
        String path1="D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\";
        String file1name="b.txt";
        File file1=new File(path1,file1name);
        System.out.println(file1);

        File file2=new File("D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise");
        String file2name="c.txt";
        File file3=new File(file2,file2name);
        System.out.println(file3);

    }




}
