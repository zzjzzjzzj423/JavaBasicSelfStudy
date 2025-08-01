package ThreadEExericise;

public class Lab5 {
    public static void main(String[] args) {
        regradBox ra = new regradBox();
        Thread thread1 = new Thread(ra);
        thread1.setName("抽奖箱1");
        Thread thread2 = new Thread(ra);
        thread2.setName("抽奖箱2");
        thread1.setPriority(1);
        thread2.setPriority(10);
        thread1.start();
        thread2.start();
    }
}
