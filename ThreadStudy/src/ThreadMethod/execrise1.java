package ThreadMethod;

public class execrise1 {

    public static void main(String[] args) {
        ThreadZZJ threadZZJ = new ThreadZZJ("ThreadZZJ");
        ThreadZZJ threadHCW = new ThreadZZJ("ThreadHCW");

        threadZZJ.setPriority(1);
        threadZZJ.start();

        threadHCW.setPriority(10);



        threadHCW.start();



    }
}
