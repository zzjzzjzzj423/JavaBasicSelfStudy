package HiglevelExericise;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class midTest {

    public long testFileInputStream (File file, File target) throws IOException {
//10
        long start=System.currentTimeMillis();
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(target);
        int length=0;
        while((length=fis.read())!=-1){
            fos.write(length);
        }
        fos.close();
        fis.close();
        long end=System.currentTimeMillis();
        return end-start;

    }

    public long testFileInputStreamWithArray(File file, File target) throws IOException {
        //1
        long start=System.currentTimeMillis();
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(target);
        byte[] buffer=new byte[1024];
        int length=0;
        while((length=fis.read(buffer))!=-1){
            fos.write(buffer,0,length);
        }
        fos.close();
        fis.close();
        long end=System.currentTimeMillis();
        return end-start;
    }


    public long testBufferedInputStream(File file, File target) throws IOException {
        //2
        long start=System.currentTimeMillis();
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(target));

        int length=0;
        while((length=bis.read())!=-1){
            bos.write(length);
        }
        bos.close();
        bis.close();
        long end=System.currentTimeMillis();
        return end-start;

    }


    public long testBufferedInputStreamWithArray(File file, File target) throws IOException {
        //0
        long start=System.currentTimeMillis();
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(target));
        byte[] buffer=new byte[1024];
        int length=0;
        while((length=bis.read(buffer))!=-1){
            bos.write(buffer,0,length);
        }
        bos.close();
        bis.close();
        long end=System.currentTimeMillis();
        return end-start;

    }

    public void adjustArticle(File file, File target) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader(file));
        BufferedWriter bw=new BufferedWriter(new FileWriter(target));
        List<String> lines=new ArrayList<>();
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
            lines.add(line);
        }
        String[] writeLines=lines.stream()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return Integer.parseInt(o1.split("\\.")[0]) - Integer.parseInt(o2.split("\\.")[0]);
                    }
                })
        .toArray(String[]::new);
        int count=0;
        while(count<writeLines.length){
            bw.write(writeLines[count]);
            bw.newLine();
            count++;
        }
        bw.close();
        br.close();
    }

    public int checkPermission() throws IOException {
        File f=new File("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\check.txt");
        if(!f.exists()){
            BufferedWriter bw=new BufferedWriter(new FileWriter(f));
            bw.write("count:3");
            bw.close();
            return 3;
        }else{
            BufferedReader br=new BufferedReader(new FileReader(f));
            int count=Integer.parseInt(br.readLine().split(":")[1]);
            count--;
            BufferedWriter bw=new BufferedWriter(new FileWriter(f));
            bw.write("count:"+count);
            bw.close();
            br.close();
            return count;
        }
    }




    public static void main(String[] args) throws IOException {

        midTest test=new midTest();
        int count=test.checkPermission();
        if((count)==0){
            System.out.println("您已体验");
        }else{
            System.out.println("这是第"+(4-count)+"次机会");
        }

        File file=new File("D:\\JavaBasicSelfStudy\\IOstream\\src\\HiglevelExericise\\tes\\poem1.txt");
        File target=new File("D:\\JavaBasicSelfStudy\\IOstream\\src\\HiglevelExericise\\tes\\poem2.txt");

        new midTest().adjustArticle(file, target);



    }
}
