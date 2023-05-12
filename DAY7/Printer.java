package DAY7;

public class Printer <T> {
    T valtoPrint;

    public Printer(T valtoPrint){
        this.valtoPrint = valtoPrint;
        }
        public void print(){
            System.out.println("valtoPrint");
    }    
}
