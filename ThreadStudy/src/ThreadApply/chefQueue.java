package ThreadApply;

import java.util.concurrent.ArrayBlockingQueue;

public class chefQueue extends Thread {
    ArrayBlockingQueue<String> queue;

    public chefQueue(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while(true){
            try {
                String food= queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
