package com.Itheima.execrise;

import java.io.File;
import java.io.IOException;

public class Exericise4 {


/*

    public boolean createNewFile()
    public boolean mkdir()
    public boolean mkdirs()
    public boolean delete()

    创建一个新的空的文件
            创建单级文件夹
    创建多级文件夹
    删除文件、空文件夹

*/
    public static void main(String[] args) throws IOException {
        System.out.println("------------------------------createNewFile");
        String path="D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\Exericise5.java";
        File file=new File(path);

        // 如果当前路径无这个文件返回true， 创建成功， 假如有返回false， 不会创建
        // 如果父路径不存在就， 有异常
        // createNewFile创建一定是个文件
        boolean result=file.createNewFile();
        System.out.println(result);

        System.out.println("------------------------------mkdir");
        String path2="D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\test";
        File file2=new File(path2);
        boolean result2=file2.mkdir();
        System.out.println(result2);

        System.out.println("-----------------------------mkdirs");
        boolean r =new File("D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\test\\asd\\zxcw").mkdirs();
        System.out.println(r);
        System.out.println("-----------------------------delete");
        boolean re=file.delete();
        System.out.println(re);
    }
}
