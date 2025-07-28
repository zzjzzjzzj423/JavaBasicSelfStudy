public class keeper extends Person{

    public keeper(){}

    public keeper(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void keepPet(Animal animal, String food){
        if(animal instanceof Dog){
            System.out.println("年龄为"+this.age+"的"+this.name+"养了一只"+animal.color+"的"+animal.age+"岁的"+"狗");
            System.out.println(animal.age+"岁的"+animal.color+"颜色的"+"狗两只前腿死死的抱住"+food+"猛吃");
        } else if (animal instanceof Cat) {
            System.out.println("年龄为"+this.age+"的"+this.name+"养了一只"+animal.color+"的"+animal.age+"岁的"+"猫");
            System.out.println(animal.age+"岁的"+animal.color+"颜色的"+"猫眯着眼睛侧着头吃"+food);
        }

    }

}
