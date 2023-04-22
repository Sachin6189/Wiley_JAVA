public class InstanceOrder {
	
	String name;
	int age;
	{
		name = "Sachin";
		age = 22;
		System.out.println("Instance block");
	}
	
	public InstanceOrder() {
		System.out.println("Name "+name + " \nAge " + age);
		System.out.println("Constructor Block");
	}
	
	public InstanceOrder(int a, int b) {
		System.out.println("Constructor Parameterized: " + (a+b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceOrder ior = new InstanceOrder();
		
		new InstanceOrder(2,3);
	}

}
