package ThreadMethod;

public class execrise3 {
    public static void main(String[] args) {
        ThreadZZJ threadZZJ = new ThreadZZJ("ThreadZZJ");
        ThreadZZJ threadZZJ1 = new ThreadZZJ("ThreadHCW");

        threadZZJ.start();
        threadZZJ1.start();
    }
}
