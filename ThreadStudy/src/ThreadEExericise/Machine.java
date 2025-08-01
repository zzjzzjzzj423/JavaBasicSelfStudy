package ThreadEExericise;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Machine implements Runnable {
    Object lock = new Object();
    int counter=1000;


    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if(counter==0){
                    System.out.println("sell is completed");
                    break;
                }else{
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    counter--;
                    System.out.println(Thread.currentThread().getName()+" have "+counter+" items");
                }
            }

        }


    }

}
