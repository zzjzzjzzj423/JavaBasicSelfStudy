package convertStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class execrise1 {

    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\JavaBasicSelfStudy\\IOstream\\src\\convertStream\\test\\kkkk.txt",Charset.forName("GBK"));
        File temp=new File("D:\\JavaBasicSelfStudy\\IOstream\\src\\convertStream\\test\\temp.txt");
        FileWriter fw=new FileWriter( temp, StandardCharsets.UTF_8);
        int len;
        char[] buf=new char[1024];
        while((len=fr.read(buf))!=-1){
            System.out.println(Arrays.toString(buf));
            fw.write(buf,0,len);
        }
        fw.close();
        fr.close();
        FileReader tempfr=new FileReader(temp);
        FileWriter finalFw=new FileWriter("D:\\JavaBasicSelfStudy\\IOstream\\src\\convertStream\\test\\kkkk.txt", StandardCharsets.UTF_8);
        char[] buf2=new char[1024];

        while((len=tempfr.read(buf2))!=-1){
            finalFw.write(buf2,0,len);
        }
        finalFw.close();
        tempfr.close();
        temp.delete();
    }

}
