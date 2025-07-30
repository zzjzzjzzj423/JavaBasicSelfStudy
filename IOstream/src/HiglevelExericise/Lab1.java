package HiglevelExericise;

import java.io.*;

public class Lab1 {

public static void main(String[] args) throws IOException {
    BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\b.txt"));
    BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\bcopy.txt"));
    int len=0;
    while((len=bis.read())!=-1){
        bos.write(len);
    }
    bos.close();
    bis.close();

}

}
