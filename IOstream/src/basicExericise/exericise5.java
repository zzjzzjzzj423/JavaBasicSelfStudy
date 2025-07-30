package basicExericise;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class exericise5 {

    public static void main(String[] args) throws IOException {
        File context=new File("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\a.txt");
        long length=context.length();
        FileInputStream Fis=new FileInputStream(context);
        char[] buf=new char[(int) length];
        int value=0;
        int count=0;
        while((value=Fis.read())!=-1){
            System.out.println((char) value);
            buf[count]=(char) value;
            count++;
        }
        Fis.close();
        String str=new String(buf);
        System.out.println(str);




    }
}
