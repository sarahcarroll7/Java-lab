import java.util.Scanner;

class nestIF {

	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	int s = 0; 
		
	System.out.println("Enter any number: ");
	
	s = scan.nextInt();
	
	if(s % 2 == 0){
	System.out.println("The number given is even number");
	else{
	System.out.println("The number given is not even number");	
	}	
	} 
}
