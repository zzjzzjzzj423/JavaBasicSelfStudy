package ThreadApply;

public class foodie extends Thread {

    @Override
    public void run() {

        while(true)
        {
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    if(Desk.foodFlag==0){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        Desk.count--;
                        System.out.println("I can eat " + Desk.count);
                        Desk.lock.notifyAll();
                        Desk.foodFlag=0;
                    }
                }

            }



        }



    }
}
