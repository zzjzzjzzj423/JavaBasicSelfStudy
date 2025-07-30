package HiglevelExericise;

import java.io.*;

public class Lab2 {

    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\b.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\bcopy2.txt"));
        byte[] buf = new byte[1024];
        int len;
        while((len=bis.read(buf))!=-1){
            bos.write(buf);
        }
        bos.close();
        bis.close();


    }
}
