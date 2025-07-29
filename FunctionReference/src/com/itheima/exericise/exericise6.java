package com.itheima.exericise;

import java.util.ArrayList;
import java.util.Collections;

public class exericise6 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);

        Integer[] a=list.stream().toArray(Integer[]::new);

    }

}
