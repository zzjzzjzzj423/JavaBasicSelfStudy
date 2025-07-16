import java.util.Scanner;

public class StringStudy {

    public void login(){
        String correctAccount="520423zzj";
        String correctPassword="520423";
        int count=3;
        while(count>0) {
            System.out.println("请输入账号");
            Scanner sc1=new Scanner(System.in);
            String account= sc1.next();
            System.out.println("请输入密码");
            Scanner sc2=new Scanner(System.in);
            String password= sc2.next();
            if(account.equals(correctAccount)) {
                if(password.equals(correctPassword)) {
                    System.out.println("登录成功");
                    break;
                }else{
                    System.out.println("密码错误， 你还可以尝试"+(count-1)+"次");
                }
            }else{
                System.out.println("账户错误, 你还可以尝试"+(count-1)+"次");
            }
            count--;
        }
    }

    public void goThrough(String str){
        int strLength=0;
        while(strLength<str.length()) {
            System.out.println(str.charAt(strLength));
            strLength++;
        }
    }

    public int[] countCharacter(String str){

        int smallCount=0;
        int bigCount=0;
        int characterCount=0;
        int otherCount=0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)>='a' && str.charAt(i)<='z') {
                smallCount++;
            }else if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
                bigCount++;
            }else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
                characterCount++;
            }else{
                otherCount++;
            }
        }
        return new int[]{smallCount,bigCount,characterCount,otherCount};

    }

    public void printSpec(char[] arr) {
        if(arr.length==0) {
            System.out.println("[]");
        }else{
        char[] str=new char[2*arr.length+1];
        int count=0;
        for(int i=0;i<str.length;i++) {
            if(i==0){
                str[0]='[';
            }else{
                str[i]=arr[count];
                i++;
                if(i==str.length-1) {
                    str[i]=']';
                }else{
                    str[i]=',';
                    count++;
                }
            }

        }
        System.out.println("拼接后的字符串是"+new String(str));
        }
    }

    public String reverseStr(String str) {
        char[] reverseArray=new char[str.length()];
        int size=str.length();
        for(int i=0;i<str.length();i++) {
            reverseArray[i]=str.charAt(size-i-1);
        }
        return new String(reverseArray);
    }


    public static void main(String[] args) {
//        System.out.println("请先输入你想要输入几个数字:");
//        Scanner sc=new Scanner(System.in);
//        int count=sc.nextInt();
//        int i=0;
//        char[] arr=new char[count];
//        while(i<count) {
//            System.out.println("请输入字符：");
//            Scanner sc1=new Scanner(System.in);
//            char ch=sc1.nextLine().charAt(0);
//            arr[i]=ch;
//            i++;
//        }
//        new StringStudy().printSpec(arr);
        Scanner sc1=new Scanner(System.in);
        String input1=sc1.next();
        System.out.println("反转为:"+new StringStudy().reverseStr(input1));

    }
}
