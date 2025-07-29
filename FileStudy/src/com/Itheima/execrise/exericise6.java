package com.Itheima.execrise;

import java.io.File;
import java.io.IOException;

public class exericise6 {

    public boolean findAvi(File folder) {
        File[] files=folder.listFiles();

        for(File f:files){
            if(f.getName().endsWith("avi")){
                return true;
            }

        }
        return false;
    }

//    public File[] authSort(File[] files) {
//
//
//
//    }



    public boolean findAviDeeply(File folder) {
        File[] files=folder.listFiles();
        for(File f:files){
            if(f.isDirectory())
            {
                if(findAviDeeply(f)){
                    return true;
                }
            }
            if(f.getName().endsWith("avi")){
                return true;
            }
        }
        return false;
    }

    public void deleteFolder(File folder) {
        File[] files=folder.listFiles();
        for(File f:files){
            if(f.isDirectory()){
                deleteFolder(f);
            }
            f.delete();
        }
    }

    public static void main(String[] args) throws IOException {
        File file=new File("D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\aaa\\a.txt");
        file.createNewFile();


        File folder=new File("D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\aaa");
        if(new exericise6().findAvi(folder)){
            System.out.println("find avi");
        }else{
            System.out.println("not find avi");
        }

        System.out.println(new exericise6().findAviDeeply(folder));

        File deleteFolder=new File("D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\www");
        new exericise6().deleteFolder(deleteFolder);

    }
}
