package ThreadEExericise;

import java.util.*;
import java.util.concurrent.Callable;

public class rewardBox implements Callable<HashMap<String,ArrayList<Integer>>> {

    static ArrayList<Integer> list=new ArrayList<>();
    static final Object lock = new Object();
    static HashMap<String,ArrayList<Integer>> map=new HashMap<>();


    public rewardBox() {
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

    }

    @Override
    public HashMap<String,ArrayList<Integer>> call() throws Exception {

        while (true) {
            synchronized (lock) {
                if(list.isEmpty()) {
                    break;
                }else{
                    Random rand = new Random();
                    int number = rand.nextInt(list.size());
                    int result = list.remove(number);
                    System.out.println(Thread.currentThread().getName()+"又产生了"+result+"元大奖");
                    if(map.containsKey(Thread.currentThread().getName()))
                    {
                        map.get(Thread.currentThread().getName()).add(result);
                    }else{
                        ArrayList<Integer> temp=new ArrayList<>();
                        temp.add(result);
                        map.put(Thread.currentThread().getName(),temp);
                    }
                }
            }
            Thread.sleep(10);
        }
        String max="";
        int maxvalue=0;
        System.out.println(map.size());
        for(Map.Entry<String,ArrayList<Integer>> entry : map.entrySet()) {

            System.out.println(entry.getKey()+":"+entry.getValue());
            for(int value:entry.getValue()) {
                if(value>maxvalue){
                    maxvalue=value;
                    max=entry.getKey();
                }
            }
        }

        System.out.println("最大的是"+max+"他的值是"+maxvalue);


        return map;
    }
}
