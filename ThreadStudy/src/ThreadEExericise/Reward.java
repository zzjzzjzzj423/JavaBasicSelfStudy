package ThreadEExericise;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;

public class Reward implements Callable<ArrayList<Integer>> {


    static ArrayList<Integer> list = new ArrayList<>();

    static Object lock = new Object();
    ArrayList<Integer> myList = new ArrayList<>();

    public Reward() {
    }


    @Override
    public ArrayList<Integer> call() throws Exception {
        while (true) {
            synchronized (lock) {
                if(list.size() == 0){
                    break;
                }else{
                    Random random = new Random();
                    int randomNum = random.nextInt(list.size());
                    myList.add(list.remove(randomNum));
                }
            }
            Thread.sleep(10);
        }
        return myList;
    }
}
