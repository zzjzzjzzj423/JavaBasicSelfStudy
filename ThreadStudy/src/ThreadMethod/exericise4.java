package ThreadMethod;

public class exericise4 {

    public static void main(String[] args) throws InterruptedException {
        ThreadZZJ threadZZJ = new ThreadZZJ("ThreadZZJ");


        threadZZJ.start();
        threadZZJ.join();
        for (int i=0; i<10; i++) {
            System.out.println("i=" + i);
        }


    }
}
