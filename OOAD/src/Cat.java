

public class Cat extends Animal {

    public Cat(){

    }

    public Cat(int age, String color) {
        super(age, color);
        this.age = age;
        this.color = color;
    }

    @Override
    public void eat(String food) {
        System.out.println("cat eat: " + food);
    }

    public void clapMouse(){
        System.out.println("cat clap mouse");
    }
}
