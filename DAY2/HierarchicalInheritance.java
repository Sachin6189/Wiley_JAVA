class Vehicle1{
	
	public void steering() {
		System.out.println("Steering");
	}
}
class Car1 extends Vehicle1{
	public void airbag() {
		System.out.println("Airbag");
	}
}
class Truck extends Vehicle1{
	public void HydraulicPump() {
		System.out.println("Hydraulic pump");
	}
	
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck t = new Truck();
		t.HydraulicPump();
		t.steering();
		Car1 c = new Car1();
		c.airbag();
		c.steering();
		
	}

}
