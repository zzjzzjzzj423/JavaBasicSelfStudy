package com.Itheima.exericise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamDemo6 {
    public static void main(String[] args) {
        /*
        * filter 过滤
        * limit 获取前几个元素
        * skip 跳过前几个元素
        * */


        System.out.println("filter 过滤");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰","张翠山","张良","王二麻子","谢广坤");
        list.stream().filter(s->s.startsWith("胡"))
                .filter(s->s.length()==2)
                .forEach(s-> System.out.println(s));


        System.out.println("limit 获取前几个元素");
        list.stream().limit(3).forEach(s-> System.out.println(s));
        System.out.println("skip 跳过前几个元素");

        list.stream().skip(3).forEach(s-> System.out.println(s));
        System.out.println("课堂测试");
        list.stream()
                .skip(3)
                .filter(s->s.startsWith("张"))
                .limit(3)
                .forEach(s-> System.out.println(s));


    }

}
