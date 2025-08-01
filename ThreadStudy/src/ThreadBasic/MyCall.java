package ThreadBasic;

import java.util.concurrent.Callable;

public class MyCall implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += i;
        }
        return result;
    }
}
