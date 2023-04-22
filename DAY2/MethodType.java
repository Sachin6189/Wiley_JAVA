public class MethodType {
	public void sub(int v1, int v2) { 
		int	val = v1 - v2;
		System.out.println("Subtraction in instance method: "+ val);
	}
	
	public void add(int v1, int v2) { 
		int	val = v1 + v2;
		System.out.println("Addition in instance method: "+ val);
		this.sub(9,5);
	}
	public static void mul(int v1, int v2) {
		int val = v1* v2;
		System.out.println("Multiplication of static method: "+val);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mul(26,36);
		
		MethodType mt = new MethodType();
		
		mt.add(25,27);

	}
}

