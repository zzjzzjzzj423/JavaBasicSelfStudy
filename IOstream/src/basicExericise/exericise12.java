package basicExericise;

import java.io.FileWriter;
import java.io.IOException;

public class exericise12 {

    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\b.txt");

        for(int i=0;i<512;i++){
            fw.write(97);
        }
        System.out.println("s");
        fw.write(98);
        System.out.println("a");
        fw.flush();

    }
}
