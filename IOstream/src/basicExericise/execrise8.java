package basicExericise;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class execrise8 {


    public static void main(String[] args) throws UnsupportedEncodingException {
        String str="周子健";
        byte[] b=str.getBytes();
        byte[] b1=str.getBytes("GBK");

        System.out.println("unicode:"+ Arrays.toString(b));
        System.out.println("GBK:"+ Arrays.toString(b1));

        String str1=new String(b);
        String str2=new String(b1,"GBK");
        System.out.println("unicode:"+str1);
        System.out.println("GBK:"+str2);

    }

}
