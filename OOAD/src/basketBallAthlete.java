public class basketBallAthlete extends athlete{
    public basketBallAthlete(){}
    public basketBallAthlete(String name, int age){
        super(name, age);
    }
    @Override
    public void study(){
        System.out.println("Basket Ball Athlete study basketball!");
    }


}
