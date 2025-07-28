public class pingpongAthlete extends athlete implements SpeakEnglish{

    public pingpongAthlete(){}

    public pingpongAthlete(String name, int age){
        super(name, age);
    }

    @Override
    public void study(){
        System.out.println("pingpong Athlete study pingpong!");
    }

    public void speak(){
        System.out.println("Pingpong Athlete study English!");
    }
}
