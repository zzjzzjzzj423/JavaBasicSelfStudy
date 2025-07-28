import java.math.BigInteger;

public abstract class Animal {
    int age;
    String color;

    public Animal(){

    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;

    }

    public void eat(String food) {
        System.out.println("eat: " + food);
    }


}
