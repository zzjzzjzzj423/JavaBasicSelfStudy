package basicExericise;

import java.io.FileOutputStream;
import java.io.IOException;

public class exericise1 {


    //FileOutputStream
    /*
    * 1.创建对象
    *   1.1 参数是字符串表示路径或是File对象都是可以的
    *   1.2 如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的
    *   1.3 如果文件已经存在，则会清空文件
    * 2. 写出数据: 参数是整数，转换为ASCII
    * 3.释放资源防止内存泄露
    * */

    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\a.txt");
        fos.write(57);
        fos.write(95);

        fos.close();

    }
}
