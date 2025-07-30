package basicExericise;

import java.io.FileWriter;
import java.io.IOException;

public class exericise11 {


    /*
    * 字符流存在一个缓冲区大小为8192
    * 当是FileWriter的对象fw.read(）后就会对缓冲区赋值
    *FileWriter 也有缓冲区 两种情况
    * */
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\b.txt",true);
        String str="按程序正常";
        char[] ch={'a','周'};
        fw.write(ch);
        fw.close();
    }
}
