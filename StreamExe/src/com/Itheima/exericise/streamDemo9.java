package com.Itheima.exericise;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class streamDemo9 {
    /**
     * void forEach(Consumer action) 遍历
     *  long count() 统计
     * toArray() 收集流中的数据， 放到数组中
     * **/
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-1", "周芷若-2", "赵敏-3", "张强-4", "张三丰-5","张翠山-99","张良-21","王二麻子-23","谢广坤-12");
        list.forEach(s-> System.out.println(s));
        long count=list.stream().count();
        System.out.println("count="+count);
        /*
        *  toArray()
        * new IntFunction<>()可以填自己需要的泛型：
        * apply的形参是数组的长度
        * apply的返回值： 具体数组的类型
        *方法体就是返回数组
        * toArray()的参数作用： 负责创建一个指定类型的数组
        * toArray()方法的底层, 会依次得到流里面的每一个数据， 并把数据放到数组中
        * toArray（）方法的返回值：是一个装有值的数组
        * */



        System.out.println("----------------------------------------------------");
        list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        for(String arr:list){
            System.out.println(arr);
        }



    }


}
