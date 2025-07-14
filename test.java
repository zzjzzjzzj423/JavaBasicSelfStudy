import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        int input1=sc1.nextInt();
        OperationBasic Ob=new OperationBasic();
//        if(Ob.simpleJudgePail(input)){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }
        int[] result=Ob.divide(input,input1);
        System.out.println("商是："+result[0]);
        System.out.println("余是："+result[1]);
    }
}
