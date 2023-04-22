public class ConstructorType {
	
	public ConstructorType(int a, int b) {
		System.out.println("2 args constructor:" + (a+b));
	}
	
	public ConstructorType(float a, int b) {
		this(2,7);
		System.out.println("2 args with float constructor"+ (a+b));
	}
	public ConstructorType() {
		System.out.println("0 args constructor");
	}
	public void add() {
		
	}

	public static void main(String[] args) {
		
		ConstructorType ct = new ConstructorType();
		
		ConstructorType ctadd = new ConstructorType(2.5f,3);

	}

}
