package basicExericise;

import java.io.FileReader;
import java.io.IOException;

public class exericise10 {


    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\b.txt");
        char[] buf=new char[2];
        int len=0;
        while((len=fr.read(buf))!=-1){
            System.out.print(new String(buf,0,len));
        }
        fr.close();


    }
}
