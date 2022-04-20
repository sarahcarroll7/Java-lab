package testexceptions;

public class TestExceptions {
	
	String s = "This is a string"; 
	
	static void validateAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("You are not eligible"); 
		} else {
			System.out.println("You are eligible to cast a vote");
		}
	  }

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		try {
			validateAge(10);
		} catch(Exception e) {
			System.out.println(e); 
		} finally {
			System.out.println("Check your age or contact admin!"); 
		}
		 
		  
	}

}
