package ThreadApply;

import java.util.concurrent.ArrayBlockingQueue;

public class cookQueue extends Thread {

    ArrayBlockingQueue<String> queue;

    public cookQueue(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                queue.put("面条");
                System.out.println("make");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }


    }

}
