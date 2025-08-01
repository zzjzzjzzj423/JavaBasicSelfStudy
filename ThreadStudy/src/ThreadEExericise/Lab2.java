package ThreadEExericise;

public class Lab2 {
    public static void main(String[] args) {
        Goods goods1 = new Goods("zzj");
        Goods goods2 = new Goods("hcw");
        goods1.start();
        goods2.start();
    }
}
