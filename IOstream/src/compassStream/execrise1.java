package compassStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class execrise1 {

    public static void unzip(File source, File target) throws IOException {
            ZipInputStream zis =new ZipInputStream(new FileInputStream(source));
            ZipEntry entry;

            while((entry=zis.getNextEntry())!=null){
                System.out.println(entry.getName());
                if(entry.isDirectory()){
                    String newFolderName=target.getAbsolutePath()+"\\"+entry.getName();
                    File newFolder=new File(newFolderName);
                    newFolder.mkdirs();
                }else{
                    String newFileName=target.getAbsolutePath()+"\\"+entry.getName();
                    FileOutputStream fos=new FileOutputStream(newFileName);
                    int len;
                    while((len=zis.read())!=-1){
                        fos.write(len);
                    }
                    fos.close();
                    zis.closeEntry();
                }
            }
            zis.close();
    }

    public static void main(String[] args) throws IOException {

        unzip(new File("D:\\JavaBasicSelfStudy\\IOstream\\src\\compassStream\\TEST.zip"),new File("D:\\JavaBasicSelfStudy\\IOstream\\src\\compassStream"));
    }

}
