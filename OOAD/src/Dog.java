public class Dog extends Animal {

    public Dog(){

    }

    public Dog(String color, int age){
        super(age, color);
        this.age = age;
        this.color = color;
    }

    public void watchHome(){
        System.out.println("Dog Watch home");
    }
    @Override
    public void eat(String food){
        System.out.println("eat");
    }


}
