package com.itheima.exericise;
/*
*
* 将小写变成大写
*
* */


import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class execrise5 {


    public String convertString(String str) {
        char a='a';
        char A='A';
        int index=A-a;
        int count=0;
        StringBuilder result = new StringBuilder("");
        while(count<str.length()){
            result.append((char) (str.charAt(count)+index));
            count++;
        }
        return result.toString();
    }


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");
        list.stream().map(new execrise5()::convertString).forEach(s->System.out.println(s));






    }
}
