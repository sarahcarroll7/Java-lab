package ifelsetest;

public class IfElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double n1 = 4.1, n2 = 6.1, n3 = 3.1, result = null; 
		
		if (n1 >= n2) {
			if (n1 >= n3) {
				result = n1; 
//				System.out.println("Largets number: " + n1);
			} 
		} else {
			if (n2 >= n3) {
				result = n2; 
//				System.out.println("Largets number: " + n2);
			} else {
				result = n3; 
//				System.out.println("Largets number: " + n3);
			}
				
		}
	System.out.printf("Largets number is %f",  result);	
	}

}
