package ThreadBasic;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class execrise3 {
    /*
    *1. 实现Callable接口
    *2. 实现Call函数
    *3. 实现FutureTask对象， 把Callable传入
    *4. 创建线程再传入FutureTask
    * 5. start
    *
    * */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCall myCall = new MyCall();
        FutureTask<Integer> ft=new FutureTask<>(myCall);
        Thread thread=new Thread(ft);
        thread.start();
        System.out.println(ft.get());

    }
}
