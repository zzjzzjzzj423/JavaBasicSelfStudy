package ThreadMethod;

public class execrise2 {

    public static void main(String[] args) {
        ThreadZZJ threadZZJ = new ThreadZZJ("ThreadZZJ");
        ThreadZZJ threadZZJ1 = new ThreadZZJ("ThreadHCW");

        threadZZJ.setDaemon(true);

        threadZZJ.start();
        threadZZJ1.start();
        
    }

}
