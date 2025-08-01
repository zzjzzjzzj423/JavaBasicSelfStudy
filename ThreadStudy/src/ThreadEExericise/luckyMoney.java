package ThreadEExericise;

import java.util.Objects;
import java.util.Random;

public class luckyMoney extends Thread{
    static int counter = 3;
    static int total=100;
    static int number=5;
    static Object lock = new Object();
    int flag=0;

    public luckyMoney(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true){
            synchronized (lock) {
                if (number == 0||flag==1) {
                    break;
                } else {
                    if (number > 2) {
                        if (counter > 1) {
                            Random rand = new Random();
                            int randomNum = rand.nextInt(1,total-1);
                            System.out.println(Thread.currentThread().getName() + "抢到了:" + randomNum);
                            total -= randomNum;
                        } else if (counter == 1) {
                            System.out.println(Thread.currentThread().getName() + "抢到了:" + total);
                        }

                    } else {
                        System.out.println(Thread.currentThread().getName() + "没有抢到红包");
                    }
                    number--;
                    counter--;
                }
                flag = 1;
            }
        }


    }



}
