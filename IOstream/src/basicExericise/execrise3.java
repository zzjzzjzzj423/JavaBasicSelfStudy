package basicExericise;

import java.io.FileOutputStream;
import java.io.IOException;

public class execrise3 {


    public static void main(String[] args) throws IOException {


        FileOutputStream fos=new FileOutputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\a.txt");
        byte[] buf={97,98,99,100,101};

        fos.write(buf,2,3);
        fos.close();
    }

}
