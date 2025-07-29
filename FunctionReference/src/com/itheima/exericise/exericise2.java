package com.itheima.exericise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class exericise2 {

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"1","2","3");

        list.stream().map(exericise2::parseInt).forEach(System.out::println);
    }
}
