
class Vehicle{
	public void tyre() {
		System.out.println("A tyre");
	}
	public void steering() {
		System.out.println("Steering");
	}
}
class Car extends Vehicle{
	public void airbag() {
		System.out.println("Airbag");
	}
}

class SmartCar extends Car{
	public void sensor() {
		System.out.println("Sensor");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartCar sc = new SmartCar();
		sc.sensor();
		sc.airbag();
		sc.steering();
		sc.tyre();
	}

}
