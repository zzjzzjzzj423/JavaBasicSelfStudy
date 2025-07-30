package basicExericise;

import java.io.*;
import java.util.Arrays;

public class MidExericise {


    public void copuFolder(File sourceFolder, File targetFolder) throws IOException {
        File[] files=sourceFolder.listFiles();
        for (File file : files) {
            if(file.isFile()){
                FileInputStream fis = new FileInputStream(file.getAbsoluteFile());
                FileOutputStream fos=new FileOutputStream(targetFolder.getAbsoluteFile()+"\\"+file.getName());
                byte[] buffer=new byte[1024*1024*1024];
                int len=0;
                while((len=fis.read(buffer))!=-1){
                    fos.write(buffer,0,len);
                }
                fos.close();
                fis.close();
            }else{
                File newFolder=new File(targetFolder.getAbsoluteFile()+"\\"+file.getName());
                newFolder.mkdir();
                copuFolder(file,newFolder);
            }
        }
    }

    public void encryptFile(File file, File targetFolder, int secretKey) throws IOException {
        FileInputStream fis=new FileInputStream(file.getAbsoluteFile());
        FileOutputStream fos=new FileOutputStream(targetFolder.getAbsoluteFile()+"\\"+file.getName()+".zzjEncrypt");
        byte[] buffer=new byte[1024*1024*5];
        int len=0;
        while((len=fis.read(buffer))!=-1){
            for(int i=0;i<buffer.length;i++){
                buffer[i]=(byte) (buffer[i]+secretKey);
            }
            fos.write(buffer,0,len);
        }
        fos.close();
        fis.close();
    }

    public void decryptFile(File file, File targetFolder, int secretKey) throws IOException {
        FileInputStream fis=new FileInputStream(file.getAbsoluteFile());
        String targetFileName=file.getName().split(".zzjEncrypt")[0];
        System.out.println(targetFileName);
        FileOutputStream fos=new FileOutputStream(targetFolder.getAbsoluteFile()+"\\"+targetFileName);
        byte[] buffer=new byte[1024*1024*5];
        int len=0;
        while((len=fis.read(buffer))!=-1){
            for(int i=0;i<buffer.length;i++){
                buffer[i]=(byte) (buffer[i]-secretKey);
            }
            fos.write(buffer,0,len);
        }
        fos.close();
        fis.close();
    }

    public void sortFile(File file,File targetFolder) throws IOException {
        FileInputStream fis=new FileInputStream(file.getAbsoluteFile());
        FileOutputStream fos=new FileOutputStream(targetFolder.getAbsoluteFile()+"\\"+file.getName()+".txt");
        byte[] buffer=new byte[1024*1024*5];
        int len=0;
        StringBuilder result=new StringBuilder("");
        while((len=fis.read(buffer))!=-1){
            result.append(new String(buffer,0,len));
        }
        String[] preSortArray=result.toString().split("-");
        Integer[] sortArray= Arrays.stream(preSortArray).map((String s)-> Integer.parseInt(s)).sorted().toArray(Integer[]::new);
        byte[] writeBuffer=new byte[sortArray.length*2-1];
        int count=0;
        int index=0;
        while(count<writeBuffer.length){
            writeBuffer[count++]=(byte) (sortArray[index++].byteValue()+'0');
            if(count<writeBuffer.length){
                writeBuffer[count++]='-';
            }

        }
        for(int i=0;i<writeBuffer.length;i++){
            System.out.println(writeBuffer[i]);
        }
        fos.write(writeBuffer,0,writeBuffer.length);
        fos.close();
        fis.close();
    }

    public void sortFile1(File file,File targetFolder) throws IOException {
        FileReader fis=new FileReader(file.getAbsoluteFile());
        FileWriter fos=new FileWriter(targetFolder.getAbsoluteFile()+"\\"+file.getName()+".txt");
        char[] buffer=new char[1024*1024*5];
        int len=0;
        StringBuilder result=new StringBuilder("");
        while((len=fis.read(buffer))!=-1){
            result.append(new String(buffer,0,len));
        }
        String[] preSortArray=result.toString().split("-");
        Integer[] sortArray= Arrays.stream(preSortArray).map((String s)-> Integer.parseInt(s)).sorted().toArray(Integer[]::new);
        char[] writeBuffer=new char[sortArray.length*2-1];
        int count=0;
        int index=0;
        while(count<writeBuffer.length){
            writeBuffer[count++]=(char) (sortArray[index++]+'0');
            if(count<writeBuffer.length){
                writeBuffer[count++]='-';
            }
        }
        for(int i=0;i<writeBuffer.length;i++){
            System.out.println(writeBuffer[i]);
        }
        fos.write(writeBuffer,0,writeBuffer.length);
        fos.close();
        fis.close();
    }



    public static void main(String[] args) throws IOException {
//        File sourceFolder=new File("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST");
//        File targetFolder=new File("D:\\JavaBasicSelfStudy\\IOstream\\src\\copy");
//        File preEncryptFile=new File("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\a.txt");
//        //new MidExericise().encryptFile(preEncryptFile,targetFolder,1000);
//        File preDecryptFile=new File("D:\\JavaBasicSelfStudy\\IOstream\\src\\copy\\a.txt.zzjEncrypt");
//        new MidExericise().decryptFile(preDecryptFile,targetFolder,1000);

            File sortFile=new File("D:\\JavaBasicSelfStudy\\IOstream\\src\\TEST\\sort");
            File targetFolder=new File("D:\\JavaBasicSelfStudy\\IOstream\\src\\copy");
        new MidExericise().sortFile1(sortFile,targetFolder);
    }

}
