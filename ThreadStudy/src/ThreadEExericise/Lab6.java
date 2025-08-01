package ThreadEExericise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Lab6 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);
        Reward.list=list;
        Reward reward=new Reward();
        Reward reward1=new Reward();
        FutureTask<ArrayList<Integer>> futureTask=new FutureTask<>(reward);
        FutureTask<ArrayList<Integer>> futureTask1=new FutureTask<>(reward1);

        Thread thread=new Thread(futureTask);
        Thread thread1=new Thread(futureTask1);
        thread.setName("抽奖箱1");
        thread1.setName("抽奖箱2");
        thread.start();
        thread1.start();
        ArrayList<Integer> list2=new ArrayList<>();
        list2=futureTask.get();
        ArrayList<Integer> list3=new ArrayList<>();
        list3=futureTask1.get();
        int sum1=0;
        int sum2=0;
        int max1=0;
        int max2=0;
        for(int num:list2){
            System.out.println("抽奖箱1:"+num);
            if(num>max1){
                max1=num;
            }
            sum1+=num;
        }
        System.out.println("抽奖箱1最大值:"+max1);
        for(int num:list3){
            System.out.println("抽奖箱2:"+num);
            if(num>max2){
                max2=num;
            }
            sum2+=num;
        }
        System.out.println("抽奖箱2最大值:"+max2);



    }

}
