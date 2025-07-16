import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        int input1=sc1.nextInt();
        OperationBasic Ob=new OperationBasic();
//        if(Ob.judgePrime(input)){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }
//        int[] result=Ob.divide(input,input1);
//        System.out.println("商是："+result[0]);
//        System.out.println("余是："+result[1]);
//        Ob.meetSeven(input,input1);
//        System.out.println(Ob.getSquare(input));
//
//        // 线程A
//        Thread threadA = new Thread(()->{
//            Ob.stackJava(input);
//        });
//
//        // 线程B
//        Thread threadB = new Thread(() -> {
//            Ob.stackJava(input1);  // 读取堆内存中的对象
//        });
//
//        threadA.start();
//        threadB.start();
        int[] arr=new int[2];
        Ob.testcs(arr);
        System.out.println("array[0]="+arr[0]+",array[1]="+arr[1]);
    }
}
