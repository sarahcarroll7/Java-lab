import java.util.Scanner;

class studMarks{

	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);

	int m = 0; 

	System.out.println("Input marks: ");	
	m = scan.nextInt();

	if(m < 50){
	System.out.println("Fail");
	} else if(m >= 50 && m <= 60){
	System.out.println("C Grade");	
	}else if(m >= 60 && m <= 75){
	System.out.println("B Grade");	
	}else if(m >= 75 && m <= 100){
	System.out.println("A Grade");	
	}else{
	System.out.println("Invalid");
	}
}
}
