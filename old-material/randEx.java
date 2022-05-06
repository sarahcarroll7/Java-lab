import java.util.Random;

class randEx{

	public static void main(String[] args){
		Random rand = new Random(); 

	for(int i = 1; i <= 10; i++){
		double n = rand.nextInt(10)+1; 
		System.out.println(n); 
			}
	}

}
