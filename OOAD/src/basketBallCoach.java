public class basketBallCoach extends coach{

    public basketBallCoach(){}

    public basketBallCoach(String name, int age){
        super(name,age);
    }
    @Override
    public void teach(){
        System.out.println("Basket Ball coach teach basketball!");
    }

}
