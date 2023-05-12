package DAY7;

class sheet {
    public synchronized void writeln(int k) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * k);
        }
    }
    
}

class Person1 extends Thread {
    sheet st;

    public Person1(sheet st) {
        super();
        this.st = st;
    }

    public void run() {
        st.writeln(5);
    }

}

class Person2 extends Thread {
    sheet st;

    public Person2(sheet st) {
        super();
        this.st = st;
    }

    public void run() {
        st.writeln(5);
    }

}

public class SynchronizationConcepts {
    public static void main(String[] args) {
        sheet st = new sheet();
        Person1 p1 = new Person1(st);
        Person2 p2 = new Person2(st);

        p1.start();
        p2.start();
    }
}
