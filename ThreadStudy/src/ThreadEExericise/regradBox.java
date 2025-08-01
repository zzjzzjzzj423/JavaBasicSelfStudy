package ThreadEExericise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class regradBox implements Runnable{

    ArrayList<Integer> list=new ArrayList<>();
    Object lock = new Object();


    public regradBox() {
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);
    }




    @Override
    public void run() {
        while (true){
            synchronized (lock) {
            if(list.isEmpty()){
                break;
            }else{
                Random rand = new Random();
                int randomNum=rand.nextInt(list.size());
                int reward=list.remove(randomNum);
                System.out.println(Thread.currentThread().getName()+"又产生了"+reward+"元大奖");


            }
            Thread.yield();
        }
        }

    }
}
