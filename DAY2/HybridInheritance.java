class A{
	public void classA() {
		System.out.println("This is class A");
	}
}
class B extends A{
	public void classB() {
		System.out.println("This is class B");
	}
}
class C extends A{
	public void classC() {
		System.out.println("This is class C");
	}
}
class D extends B{
	public void classD() {
		System.out.println("This is Class D");
	}
}
class E extends D{
	public void classE() {
		System.out.println("This is Class E");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e = new E();
		e.classE();
		
		D d = new D();
		d.classD();
		
		C c =new C();
		c.classC();
		
		B b =new B();
		b.classB();
		
		A a= new A();
		a.classA();
		
		
	}

}