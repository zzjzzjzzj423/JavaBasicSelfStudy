package ThreadApply;

public class Desk {

    public static int foodFlag=0;

    public static Object lock=new Object();

    public static int count=10;

    public static void main(String[] args) {
        chef ch=new chef();
        ch.setName("chef");
        foodie f=new foodie();
        f.setName("foodie");
        ch.start();
        f.start();
    }
}
