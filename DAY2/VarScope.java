public class VarScope {
	
	int ins = 20;
	int val = 18;
	int val1 = 12;
	static String name = "Sachin";
	
	public void sum() {
		int val = 10;
		int val1 = 25;
		System.out.println("sum method: "+ (this.val+this.val1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 18;
		int loc = 10;
		
		VarScope vso = new VarScope();
		
		//System.out.println("local value: " + this.val);
		
		System.out.println("Local Variable: " + loc);
		
		System.out.println("Instance variable: " + vso.ins);
		
		System.out.println("Instance variable: " + name);
		
		vso.sum();		
		
	}

}
