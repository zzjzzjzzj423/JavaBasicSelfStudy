package com.itheima.exericise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class amap2 {



    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        ArrayList<String> list=new ArrayList<>();
        Random r=new Random();
        for(int i=0;i<80;i++){
            list.add(arr[r.nextInt(arr.length)]);
        }

        HashMap<String,Integer> map=new HashMap<>();
        for(String interests:list){
            if(map.containsKey(interests)){
                map.put(interests,map.get(interests)+1);
            }else{
                map.put(interests,1);
            }
        }
        System.out.println(map.toString());


    }
}
