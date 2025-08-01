package ThreadApply;

public class ThreadTask implements Runnable {

    int tickets=0;

    public synchronized boolean sellTicket() {
        if(tickets==100) {
            return true;
        }else{
            tickets++;
            System.out.println(Thread.currentThread().getName()+" sell ticket "+tickets);
            return false;
        }
    }


    public void run() {
    while(true){
    if(sellTicket()) {
        break;
    }
    }


    }

}
