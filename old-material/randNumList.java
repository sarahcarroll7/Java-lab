import java.util.Random;

public class numList {


	public static void main(String[] args){
	
		Random rand = new Random(); 

		for (int i=0; i<10; i++){

		int randNum = rand.nextInt();

		System.out.println(randNum); 

		}

	}

}