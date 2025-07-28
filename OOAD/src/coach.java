public abstract class coach extends Person implements teach{

    public coach(){}

    public coach(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void teach();
}
