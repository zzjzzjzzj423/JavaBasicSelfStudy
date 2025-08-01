package convertStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class execrise2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\convertStream\\test\\poem.txt")));
        String temp;
        while((temp=br.readLine())!=null){
            System.out.println(temp);
        }
        br.close();


    }
}
