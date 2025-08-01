package ThreadEExericise;

public class Lab1 {

    public static void main(String[] args) {
        Machine m=new Machine();

        Thread thread1=new Thread(m);
        thread1.setName("M1");
        Thread thread2=new Thread(m);
        thread2.setName("M2");
        thread1.start();
        thread2.start();

    }

}
