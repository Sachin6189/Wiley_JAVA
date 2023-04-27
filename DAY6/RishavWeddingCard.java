import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WeedingCardWrap extends Thread{
    public void run(){
        System.out.println("Thread name:- " + Thread.currentThread().getName());
    }
}

public class RishavWeddingCard {
    public static void main(String[] args) {
        // ExecutorService ececuter = Executors.newFixedThreadPool(4);
        ExecutorService ececuter = Executors.newCachedThreadPool();

        for(int i=1; i<=100; i++){
            ececuter.execute(new WeedingCardWrap());
        }
    }
}
