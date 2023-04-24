package DAY3;


//In JAVA, uncaught exceptions occur when an exception is thrown with in a method and 
//there is no code in place to catch and handle the exception, when this happens, the exception is
//propagated up the call stack until it is caught by an appropriate exception handler or
//until it reached the top or the call stack and is terminated


public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception caught" + e.getMessage());
		}
	}
	public static void method1() throws Exception{
		method2();
	}
	public static void method2()throws Exception {
		// TODO Auto-generated method stub
		throw new Exception ("Exception occured in method 2");
	}
}
