package com.Itheima.exericise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {


    /*
    * distinct 去重（依赖底部的hashcode和equals）
    * concat（合并a和b两个流）
    *
    * */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌","张无忌","张无忌", "周芷若", "赵敏", "张强", "张三丰","张翠山","张良","王二麻子","谢广坤");

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "周芷若","赵敏");

       list.stream().distinct().forEach(s-> System.out.println(s));
        Stream.concat(list1.stream(), list.stream()).forEach(s-> System.out.println(s));

    }
}
