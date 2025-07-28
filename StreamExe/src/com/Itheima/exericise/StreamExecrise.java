package com.Itheima.exericise;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExecrise {



    public static void main(String[] args) {

        System.out.println("------------------exe1-------------------------");
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Set<Integer> set1=new HashSet<>();
        for(int a:arr){
            set1.add(a);
        }
        Set<Integer> newSet=set1.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer%2==0){
                    return true;
                }
                return false;
            }
        }).collect(Collectors.toSet());

        for(Integer a:newSet){
            System.out.println(a);
        }

        System.out.println("------------------exe2-------------------------");
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"zhangsan,23","lisi,24","wangwu,25");

        Map<String, Integer> newMap=list2.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                String result=s.split(",")[1];
                int age=Integer.parseInt(result);
                if(age>=24){
                    return true;
                }
                return false;
            }
        }).collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {

                return s.split(",")[0];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split(",")[1]);
            }
        }));

        for(Map.Entry<String, Integer> entry:newMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("------------------exe3-------------------------");

//        ArrayList<String> list3=new ArrayList<>();
//        Collections.addAll(list3,"张三,23","李四,24","金成武,25","林思广,26","周子健,27","和曾光,28");
//        ArrayList<String> list4=new ArrayList<>();
//        Collections.addAll(list4,"胡晨薇,23","杨幂,24","林俊杰,25","杨知道,26","杨杰伦,27","张子枫,28");
//
//        Stream<String> s1= list3.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.split(",")[0].length() == 3;
//            }
//        }).limit(2);
//
//
//        Stream<String> s2= list4.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.split(",")[0].charAt(0)=='杨';
//            }
//        }).skip(1);
//
//        Map<String,Integer> mapAct= Stream.concat(s1,s2).collect(Collectors.toMap(new Function<String, String>() {
//
//            @Override
//            public String apply(String s) {
//                return s.split(",")[0];
//            }
//        }, new Function<String, Integer>() {
//
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s.split(",")[1]);
//            }
//        }));
//
//        ArrayList<Actor> list5=new ArrayList<>();
//    for(Map.Entry<String,Integer> entry:mapAct.entrySet()){
//        Actor actor=new Actor(entry.getKey(),entry.getValue());
//        list5.add(actor);
//    }
//
//        System.out.println("---------------封装后----------------------");
//
//    for(Actor actor:list5){
//        System.out.println(actor.toString());
//    }


        System.out.println("---------------exe3的老师答案----------------------");
        ArrayList<String> list3=new ArrayList<>();
        Collections.addAll(list3,"张三,23","李四,24","金成武,25","林思广,26","周子健,27","和曾光,28");
        ArrayList<String> list4=new ArrayList<>();
        Collections.addAll(list4,"胡晨薇,23","杨幂,24","林俊杰,25","杨知道,26","杨杰伦,27","张子枫,28");

        Stream<String> s1= list3.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.split(",")[0].length() == 3;
            }
        }).limit(2);


        Stream<String> s2= list4.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.split(",")[0].charAt(0)=='杨';
            }
        }).skip(1);

        Stream.concat(s1,s2).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String name=s.split(",")[0];
                int age=Integer.parseInt(s.split(",")[1]);
                return new Actor(name,age);
            }
        }).collect(Collectors.toList()).forEach(s-> System.out.println(s));


    }
}
