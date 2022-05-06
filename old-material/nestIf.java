import java.util.Scanner; 

class nestIf {
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in); 
	
	int s = 0; 
	
	System.out.println("Enter some number: ");

	s = scan.nextInt();

	if(s % 2 == 0){

		System.out.println("The number is even"); 
		
		} else{

		System.out.println("The numbe is not even");

		}	
	
	}

}
