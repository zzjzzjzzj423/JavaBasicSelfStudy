package ThreadApply;

public class chef extends Thread {


    @Override
    public void run() {

        while(true) {
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else {
                    if (Desk.foodFlag == 1) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println("Chef make one noddles");
                        Desk.lock.notifyAll();
                        Desk.foodFlag = 1;
                    }
                }
            }


        }



    }


}
