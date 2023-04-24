package DAY3;


import java.util.ArrayList;

class StringNotFound extends RuntimeException{
	public StringNotFound(String message) {
		super(message);
	}
}

public class UnChecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> student = new ArrayList<String>();
		student.add("Sachin");
		student.add("Muskan");
		student.add("Robin");
		
		if (!student.contains("SachinK")) {
			try {
				throw new StringNotFound("This string not found");
			}catch(StringNotFound e) {
				e.printStackTrace();
				
			}
		}
		System.out.println("Message One");
		System.out.println("Message two");
		
	}