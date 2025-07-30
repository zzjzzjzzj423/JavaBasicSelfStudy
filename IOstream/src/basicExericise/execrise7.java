package basicExericise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class execrise7 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\zzj\\Desktop\\6.12GameDemo.mp4");
        FileOutputStream fos=new FileOutputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\aasx.mp4");
        int value=0;
        byte[] buf=new byte[1024*1024*10];
        while ((value=fis.read(buf))!=-1){
            fos.write(buf,0,value);
        }
        fos.close();
        fis.close();
    }
}
