package com.itheima.exericise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class exericise3 extends fatherExericise {
    /*
    * 引用成员方法
    * 格式： 对象 ::成员方法
    * 其他类: 其他类对象::方法名
    * 本类:  this::方法名
    * 父类: super:: 方法名
    * */



    public List<String> filterNames(List<String> names) {
        return names.stream().filter(super::filterRule).toList();

    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张嘉琪", "张真源", "张健", "周子健", "周杰伦", "胡晨薇");
        List<String> names = new exericise3().filterNames(list);
        for (String s : names) {
            System.out.println(s);
        }

    }

}
