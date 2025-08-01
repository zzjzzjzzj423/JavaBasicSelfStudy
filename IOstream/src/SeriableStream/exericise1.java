package SeriableStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class exericise1 {
    public static void main(String[] args) throws IOException {
        Student s = new Student(12,"子健","nan");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\SeriableStream\\testFile\\oo.txt"));
        oos.writeObject(s);
        oos.close();
    }

}
