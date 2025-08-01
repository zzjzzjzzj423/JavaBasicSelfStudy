package ThreadApply;

public class execrise2 {

    public static void main(String[] args) {
        ThreadTask threadTask = new ThreadTask();
        Thread thread1 = new Thread(threadTask);
        Thread thread2 = new Thread(threadTask);
        Thread thread3 = new Thread(threadTask);

        thread1.setName("Machine 1");

        thread2.setName("Machine 2");
        thread3.setName("Machine 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
