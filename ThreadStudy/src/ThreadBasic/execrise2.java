package ThreadBasic;

public class execrise2 {

    /*
    * 1. 实现Runnable接口
    * 2. 实现run方法
    * 3.创建thread对象， 传入runnable的类对象
    * 4. start
    *
    * 得不到结果
    * */

    public static void main(String[] args) {

        MissionA ma=new MissionA();
        Thread t1=new Thread(ma);
        Thread t2=new Thread(ma);

        t1.setName("thread1");
        t2.setName("thread2");
        t1.start();
        t2.start();
    }
}
