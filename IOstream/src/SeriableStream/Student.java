package SeriableStream;

import java.io.Serial;
import java.io.Serializable;


//修改代码后会导致JavaBean的版本号发生改变所以需要让版本号不变
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    int age;
    String name;
    //不想写入本地文件
    transient String address;
    public Student(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "age=" + age + ", name=" + name+ ", address=" + address;
    }
}
