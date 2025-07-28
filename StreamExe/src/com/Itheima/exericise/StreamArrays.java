package com.Itheima.exericise;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class StreamArrays {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9};

        Arrays.stream(arr).forEach(new IntConsumer() {
            @Override
            public void accept(int i) {
                System.out.println(i);
            }
        });

        String[] arr1={"a","b","c","d","e","f"};
        Arrays.stream(arr1).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
