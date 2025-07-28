package com.Itheima.exericise;

import java.util.function.IntConsumer;
import java.util.stream.Stream;

public class StreamDemo5 {

    public static void main(String[] args) {

        Stream.of(1,2,3,4).forEach(s->System.out.println(s));


    }
}
