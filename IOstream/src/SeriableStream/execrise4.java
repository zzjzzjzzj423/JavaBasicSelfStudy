package SeriableStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class execrise4 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\SeriableStream\\testFile\\oo.txt"));
        ArrayList<Student> list=(ArrayList<Student>) ois.readObject();
        for(Student s:list){
            System.out.println(s);
        }
        ois.close();

    }

}
