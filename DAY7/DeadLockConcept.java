package DAY7;

public class DeadLockConcept {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String[] args) {
        LockThread lt1 = new LockThread();
        lt1.start();
    }

    private static class LockThread extends Thread {
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread one hold: Lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("Thread 1 is waiting for lock 2");
            synchronized (Lock2) {
                System.out.println("Thread one hold: Lock2");

            }
        }
    }
}