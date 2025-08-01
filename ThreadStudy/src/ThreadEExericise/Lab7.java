package ThreadEExericise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.FutureTask;

public class Lab7 {
    public static void main(String[] args) {

        rewardBox rb = new rewardBox();
        FutureTask<HashMap<String, ArrayList<Integer>>> ft=new FutureTask<>(rb);
        FutureTask<HashMap<String, ArrayList<Integer>>> ft1=new FutureTask<>(rb);
        Thread t1=new Thread(ft);
        t1.setName("Box 1");
        Thread t2=new Thread(ft1);
        t2.setName("Box 2");
        t1.start();
        t2.start();

    }
}
