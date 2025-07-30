package basicExericise;

import java.io.FileReader;
import java.io.IOException;

public class exericise9 {
    public static void main(String[] args) throws IOException {
        FileReader Fr=new FileReader("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\b.txt");
        int ch=0;
        while((ch= Fr.read())!=-1){
            System.out.print((char)ch);
        }
        Fr.close();

    }
}
