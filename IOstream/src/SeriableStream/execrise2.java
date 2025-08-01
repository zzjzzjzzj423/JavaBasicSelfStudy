package SeriableStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Objects;

public class execrise2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\SeriableStream\\testFile\\oo.txt"));
        Student s= (Student) ois.readObject();
        ois.close();
        System.out.println(s);

    }

}
