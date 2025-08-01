package ThreadApply;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    static int ticket=0;
    static Lock lock = new ReentrantLock();
    public MyThread() {}

    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {

        while(true) {
            lock.lock();
            try{
                if(ticket<1000){
                    Thread.sleep(1);
                    ticket++;
                    System.out.println(Thread.currentThread().getName()+" sell No."+ticket);
                    Thread.yield();
                }else{
                    break;
                }
            }catch (InterruptedException e) {
                e.printStackTrace();

            }finally {
                lock.unlock();

            }

        }




    }
}
