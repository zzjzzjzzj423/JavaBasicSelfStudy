package com.Itheima.execrise;

import java.io.File;

public class Exericise5 {
    public static void main(String[] args) {
        File file=new File("D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise");
        File[] f=file.listFiles();
        for(int i=0;i<f.length;i++){
            System.out.println(f[i].getName());
        }
    }
}
