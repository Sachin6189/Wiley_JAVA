package DAY3;

abstract class Test1{
	{
		System.out.println("Test 1 instance block");
	}
	static{
		System.out.println("Test1 static block");
	}
	public abstract void m1();
	
	public void m2() {
		System.out.println("Test1 m2 method");
	}
	

	protected static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is test 1 main method from abstract class");
	}
	public Test1() {
		System.out.println("Test1 constructor");
	}
}

class Test2 extends Test1{
	{
		System.out.println("test 2 instance block");
	}
	static{
		System.out.println("Test 2 static block");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("test2 m1 method");
	}
	public Test2() {
		System.out.println("Test2 Constructor");
	}
}

public class AbstractionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2 = new Test2();
		t2.m1();
		t2.m2();
		
		Test1.main(args);
	}

}
