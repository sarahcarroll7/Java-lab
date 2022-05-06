import static java.lang.Math.*;
import java.util.Random; 

class doWhileRand{

	public static void main(String[] args){

	int i = 1; 
	
//	Random rand = new Random();
	double random = Math.random() * 50 + 1;

	do{
	System.out.println(random);
	i++;
	}while(i <= 10);



	}



}
