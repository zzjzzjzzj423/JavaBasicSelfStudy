package com.Itheima.exericise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo8 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-1", "周芷若-2", "赵敏-3", "张强-4", "张三丰-5","张翠山-99","张良-21","王二麻子-23","谢广坤-12");

        list.stream().map(new Function<String,Integer>(){

            @Override
            public Integer apply(String s) {
                String[] result=s.split("-");

                return Integer.parseInt(result[1]);
            }
        }).forEach(s-> System.out.println(s));

    }
}
