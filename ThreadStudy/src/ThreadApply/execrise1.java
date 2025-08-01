package ThreadApply;

public class execrise1 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread("No.1 Machine");
        MyThread myThread2 = new MyThread("No.2 Machine");
        MyThread myThread3 = new MyThread("No.3 Machine");
        myThread.start();
        myThread2.start();
        myThread3.start();
    }

}
