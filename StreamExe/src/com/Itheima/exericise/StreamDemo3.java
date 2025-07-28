package com.Itheima.exericise;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class StreamDemo3 {

//双列集合不可以直接使用Stream， 需要转换为set集合（keySet或者是entrySet）
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");


        map.keySet().stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        map.entrySet().stream().forEach(new Consumer<Map.Entry<Integer, String>>() {
            @Override
            public void accept(Map.Entry<Integer, String> integerStringEntry) {
                System.out.println(integerStringEntry.getKey() + " " + integerStringEntry.getValue());
            }
        });

    }
}
