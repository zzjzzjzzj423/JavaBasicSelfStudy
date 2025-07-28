public class pingpongCoach extends coach implements SpeakEnglish{
    public pingpongCoach(){}

    public pingpongCoach(String name, int age){
        super(name, age);
    }
    @Override
    public void teach(){
        System.out.println("Pingpong Athlete teach Pingpong!");
    }

    public void speak(){
        System.out.println("Pingpong Coach study English!");
    }




}
