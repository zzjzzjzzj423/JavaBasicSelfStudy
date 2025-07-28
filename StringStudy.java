import java.util.Scanner;
import java.util.StringJoiner;

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

    public String joinerPrintSpec(int[] arr) {
        StringJoiner joiner=new StringJoiner(",","[","]");
        for(int i=0;i<arr.length;i++) {
            joiner.add(arr[i]+"");
        }
        return joiner.toString();

    }

    public String reverseStr(String str) {
        char[] reverseArray=new char[str.length()];
        int size=str.length();
        for(int i=0;i<str.length();i++) {
            reverseArray[i]=str.charAt(size-i-1);
        }
        return new String(reverseArray);
    }

    public String judgeMoney(int money) {
        switch (money){
            case 0:
                return "零";
            case 1:
                return "壹";
            case 2:
                return "贰";
            case 3:
                return "叁";
            case 4:
                return "肆";
            case 5:
                return "伍";
            case 6:
                return "陆";
            case 7:
                return "柒";
            case 8:
                return "捌";
            case 9:
                return "玖";
            case 10:
                return "拾";
        }
    return "";
    }

    public String judgeUnit(int unit) {
        switch (unit) {
            case 0:
                return "元";
            case 1:
                return  "拾";
            case 2:
                return "佰";
            case 3:
                return "迁";
            case 4:
                return "万";
            case 5:
                return "拾";
            case 6:
                return "佰";

        }
        return "";

    }

    public String convertString(int money) {
            String result="";
            for(int i=0;i<7;i++) {
                int number=money%10;
                result=judgeMoney(number)+judgeUnit(i)+result ;
                money=money/10;
            }
            return result;
    }

    public boolean judgeFolder(String str){
        StringBuilder sb=new StringBuilder(str);

        return sb.reverse().toString().equals(sb.reverse().toString());
    }

    public String convertRoman(String number)
    {
        StringBuilder result=new StringBuilder();
        if(number.length()>9) {
            return result.toString();
        }

        String[] arr={"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        for(int i=0;i<number.length();i++) {
            if(number.charAt(i)>='0'&&number.charAt(i)<='9') {
            int index=number.charAt(i)-'0';
            result.append(arr[index]);
            }else{
                return null;
            }
        }
        return result.toString();

    }


    public boolean spinStr(String str_source, String str_target) {
        if(str_source.length()!=str_target.length()) {
            return false;
        }
        StringBuilder temp=new StringBuilder(str_source);


        for(int i=0;i<str_source.length();i++) {
            String partStr=temp.substring(1,str_source.length());
            String speChar=temp.charAt(0)+"";
            StringBuilder sb=new StringBuilder(partStr).append(speChar);
            temp=sb;
            if(sb.toString().equals(str_target)) {
                return true;
            }
        }
        return false;


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
        Scanner sc2=new Scanner(System.in);
        String input2=sc2.next();
        if(new StringStudy().spinStr(input1,input2)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        int a='0'-48;
        System.out.println("a="+a);

    }
}
