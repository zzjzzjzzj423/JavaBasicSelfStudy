package SeriableStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class execrise3 {

    public static void main(String[] args) throws IOException {
        Student s1 = new Student(1, "John", "Doe");
        Student s2 = new Student(2, "Jane", "Doe");
        Student s3 = new Student(3, "Jack", "Doe");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\JavaBasicSelfStudy\\IOstream\\src\\SeriableStream\\testFile\\oo.txt"));
        out.writeObject(students);
        out.close();

    }


}
