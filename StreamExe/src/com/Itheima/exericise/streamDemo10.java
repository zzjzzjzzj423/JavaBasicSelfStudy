package com.Itheima.exericise;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//collect

public class streamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-1", "周芷若-女-2", "赵敏-女-3", "张强-男-4", "张三丰-男-5","张翠山-女-99","张良-男-21","王二麻子-男-23","谢广坤-男-12");
        //收集所有男性到list

        List<String> newList1= list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.contains("男")){
                    return true;
                }
                return false;
            }
        }).collect(Collectors.toList());

        for (String s : newList1) {
            System.out.println(s);
        }

        System.out.println("-------------------------------------");


        //到set
        Set<String> newSet= list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.contains("男")){
                    return true;
                }
                return false;
            }
        }).collect(Collectors.toSet());

        for (String s : newSet) {
            System.out.println(s);
        }



        System.out.println("-------------------------------------");
        //到map

        Map<String,Integer> newMap=list.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        if(s.contains("男")){
                            return true;
                        }
                        return false;
                    }
                }).collect(Collectors.toMap(new Function<String, String>() {

                    @Override
                    public String apply(String s) {
                        String[] result=s.split("-");
                        return result[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        String[] result=s.split("-");

                        return Integer.parseInt(result[2]);
                    }
                }));

        for (Map.Entry<String,Integer> entry : newMap.entrySet()) {

            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }

}
