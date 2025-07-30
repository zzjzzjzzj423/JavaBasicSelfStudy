package basicExericise;

import java.io.FileOutputStream;
import java.io.IOException;

public class execrise4 {
    public static void main(String[] args) throws IOException {
        //第二个参数可以续写
        FileOutputStream fos=new FileOutputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\a.txt",true);
        String context="zhouzijianshuaisil";
        byte[] buf=context.getBytes();
        fos.write(buf);
        fos.write("\r\n".getBytes());
        String context2="axaw";
        byte[] buf2=context2.getBytes();
        fos.write(buf2);
        fos.close();

    }

}
