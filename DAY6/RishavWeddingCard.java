import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class WeedingCardWrap extends Thread{
    public void run(){
        System.out.println("Thread name:- " + Thread.currentThread().getName());
    }
}

public class RishavWeddingCard {
    public static void main(String[] args) {
        //Fixed size pool
        // ExecutorService ececuter = Executors.newFixedThreadPool(4);

        //Cached thread pool
        ExecutorService ececuter = Executors.newCachedThreadPool();

        // for(int i=1; i<=100; i++){
        //     ececuter.execute(new WeedingCardWrap());
        // }

        ScheduledExecutorService executer = Executors.newScheduledThreadPool(3);
        // executer.scheduleAtFixedRate(new WeedingCardWrap(), 10, 2, TimeUnit.SECONDS);

        executer.scheduleWithFixedDelay(new WeedingCardWrap(), 5, 2, TimeUnit.SECONDS);
        
    }
}
