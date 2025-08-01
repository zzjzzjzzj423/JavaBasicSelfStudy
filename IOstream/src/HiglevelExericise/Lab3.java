package HiglevelExericise;


import java.io.*;

// 缓冲流通过基本流，将数据导入缓冲区(8192字节)， 随后缓冲流对象只需从缓冲区中读写
public class Lab3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\a.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\acopy.txt"));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
