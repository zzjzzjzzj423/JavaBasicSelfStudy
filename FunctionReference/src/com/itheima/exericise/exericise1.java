package com.itheima.exericise;

import java.util.Arrays;
import java.util.Comparator;

public class exericise1 {

    public static int sub(int a, int b) {
        return b-a;
    }

    public static void main(String[] args) {
        Integer[] a = {15,6,7,8,9,10,2,3,4};


        //方法引用必须是函数式接口（只有一个函数的接口）
        //被引用的方法必须已经存在
        //被引用方法的形参和返回值保持一致
        //其中::是方法引用符
        Arrays.sort(a, exericise1::sub);




    }

}
