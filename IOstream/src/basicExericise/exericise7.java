package basicExericise;

import java.io.FileInputStream;
import java.io.IOException;

public class exericise7 {


    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\a.txt");
        byte[] buf=new byte[2];
        int len=fis.read(buf);

        String str=new String(buf, 0, len);
        System.out.println(str);
    }
}
