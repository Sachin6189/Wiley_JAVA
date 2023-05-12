package DAY7;

class SupportClass extends Thread{
    public void run(){
        if (Thread.currentThread().isDaemon()){
            System.out.println("This is demon");
        }else{
            System.out.println("This is not demon");
        }
    }
}

public class Demontype {
    public static void main(String[] args) {
        SupportClass t1 = new SupportClass();
        SupportClass t2 = new SupportClass();
        SupportClass t3 = new SupportClass();

        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
        
    }
}
