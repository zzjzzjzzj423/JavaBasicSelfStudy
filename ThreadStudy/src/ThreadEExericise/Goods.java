package ThreadEExericise;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Goods extends Thread{
    static Lock lock = new ReentrantLock();
    static int counter = 100;

    public Goods(){}

    public Goods(String name) {
        super(name);
    }

    @Override
    public void run(){
        while (true){
            lock.lock();
            if(counter<10){
                System.out.println("goods: "+counter+" is completed");
                break;
            }else{
                counter--;
                System.out.println("send to"+Thread.currentThread().getName()+",goods: "+counter);
            }
            lock.unlock();
        }

    }

}
