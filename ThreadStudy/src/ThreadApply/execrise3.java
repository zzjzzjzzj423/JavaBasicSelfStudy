package ThreadApply;

import java.util.concurrent.ArrayBlockingQueue;

public class execrise3 {


    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);
        chefQueue chefQueue1 = new chefQueue(queue);
        cookQueue cookQueue1 = new cookQueue(queue);
        chefQueue1.start();
        cookQueue1.start();
    }
}
