
class Tpriority extends Thread{
    public void run(){
        for(int i=1; i<=10;i++){
            System.out.println("Thread Name:- " + Thread.currentThread().getName() +
            "  Thread Priority:-" + Thread.currentThread().getPriority()+
            "  Thread Id:-" + Thread.currentThread().getId());
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) throws InterruptedException {

        // Thread.currentThread().setPriority(8);
        // System.out.println("Main Thread:- " + Thread.currentThread().getPriority());
        // Tpriority t1 = new Tpriority();
        // t1.setPriority(10);
        // Tpriority t2 = new Tpriority();

        Tpriority t1 = new Tpriority();
        Tpriority t2 = new Tpriority();
        Tpriority t3 = new Tpriority();

       t1.start();
       t1.join(100);
       System.out.println(t1.getState());
       t2.start();
       t2.join();
       System.out.println(t2.getState());
       t3.start();
    }
}
