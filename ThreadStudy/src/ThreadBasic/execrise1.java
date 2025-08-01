package ThreadBasic;

public class execrise1 {
/*
* 1.thread继承
* 2.重写run
* 3.start
*
* 缺点无法继承其他类
* */

    public static void main(String[] args) {
        ThreadA a=new ThreadA();
        a.setName("zj");
        ThreadA b=new ThreadA();
        b.setName("zzco");
        a.start();
        b.start();
    }
}
