class Bike{
	public void run() {
	System.out.println("Running");
	}
}
class Enfield extends Bike{
	public void run() {
		System.out.println("Running at 60 kmph");
	}
}

public class PolymorphismExample {
	public static void main(String[] args) {
		Bike b =new Enfield();
		b.run();
	}

}
