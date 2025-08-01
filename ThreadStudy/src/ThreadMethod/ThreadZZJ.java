package ThreadMethod;

public class ThreadZZJ extends Thread{

    public ThreadZZJ() {

    }

    public ThreadZZJ(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(currentThread().getName() + " " + i);
            Thread.yield();
        }

    }
}
