package printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class exericise1 {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out=new PrintStream(new FileOutputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\printStream\\test\\asx.txt"));
        out.printf("我说啊你是谁？ 你是%s","周子健");
        out.close();
    }

}
