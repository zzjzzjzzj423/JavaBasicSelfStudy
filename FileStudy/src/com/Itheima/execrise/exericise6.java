package com.Itheima.execrise;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

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
            }else{
                f.delete();
            }
        }
        folder.delete();
    }

    public HashMap<String,Integer> countFile(File folder,HashMap<String,Integer> result) {
        File[] files=folder.listFiles();
        for(File f:files){
            if (f.isDirectory()){
                countFile(f,result);
            }else{
                String[] nameArray=f.getName().split("\\.");
                if(nameArray.length>=2){
                    String suffix=nameArray[nameArray.length-1];
                    if(result.containsKey(suffix)){
                        result.put(suffix,result.get(suffix)+1);
                    }else {
                        result.put(suffix,1);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
//        File file=new File("D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\aaa\\a.txt");
//        file.createNewFile();
//
//
//        File folder=new File("D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\aaa");
//        if(new exericise6().findAvi(folder)){
//            System.out.println("find avi");
//        }else{
//            System.out.println("not find avi");
//        }

        File countFolder=new File("D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\www");
//        File deleteFolder=new File("D:\\JavaBasicSelfStudy\\FileStudy\\src\\com\\Itheima\\execrise\\wwwwww");
//        new exericise6().deleteFolder(deleteFolder);
        HashMap<String,Integer> count=new HashMap<>();
        System.out.println(new exericise6().countFile(countFolder,count));

    }
}
