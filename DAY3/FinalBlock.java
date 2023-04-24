package DAY3;

public class FinalBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	System.out.println("1111111");
	System.out.println("Wiley");
	System.out.println(10/0);
	//System.exit(0);
	System.out.println("Edge");
}catch(Exception e){
	System.out.println("Catch block");
	//System.exit(0);
	//System.out.println(10/0);
	e.printStackTrace();
}finally {
	//System.out.println(10/0);
	System.out.println("clone connection");
}
System.out.println("last statement");
}

}
