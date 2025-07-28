package com.itheima.exericise;

import com.itheima.exericise.Student;

import java.util.*;

public class amap1 {


    public static void main(String[] args) {

        HashMap<String,String> map1=new HashMap<>();
        map1.put("desk","red");
        map1.put("chair","blue");
        map1.put("computer","green");
        Set<String> s=map1.keySet();
        System.out.println("-----------------------------------------------------------");
        for (String key : s) {
            System.out.println("key: " + key + " value: " + map1.get(key));
        }

        System.out.println("-----------------------------------------------------------");
        map1.forEach((k,v)->{
            System.out.println("key: " + k + " value: " + v);
        });

        System.out.println("-----------------------------------------------------------");
        //Entry是键值对对象，entry是内部接口
        Iterator<Map.Entry<String, String>> itr=map1.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<String, String> entry=itr.next();
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
        System.out.println("-----------------------------------------------------------");
        Set<Map.Entry<String,String>> set=map1.entrySet();
        for(Map.Entry<String,String> entry:set) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
        System.out.println("-----------------------------------------------------------");
        Student s1=new Student("zzj",1);
        Student s2=new Student("zzj",1);
        Student s3=new Student("zjsd",3);

        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        }else {
            System.out.println("s1 not equals s2");
        }

        HashMap<Student,String> calss=new HashMap<>();
        calss.put(s1,"GUIZHOU");
        calss.put(s2,"GUANGZHOU");
        calss.put(s3,"XINJIANG");

        for(Map.Entry<Student,String> entry:calss.entrySet()) {
            System.out.println("key: " + entry.getKey().toString() + " value: " + entry.getValue());
        }

        TreeMap<Integer,String> map=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        map.put(100,"zksd");
        map.put(101,"zksd-1");
        map.put(1,"zksd-Source");
        System.out.println(map);


    }
}
