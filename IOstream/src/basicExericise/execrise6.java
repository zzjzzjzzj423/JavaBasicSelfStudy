package basicExericise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class execrise6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\a.txt");
        FileOutputStream fos=new FileOutputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\acopy.txt");
        int value;
        while((value=fis.read())!=-1){
            fos.write(value);
        }
        fis.close();
        fos.close();


    }

}
