import java.util.Random;

public class numList {
public static void main(String[] args){
	
	int[] arr;
	arr = new int[10];
	
	Random rand = new Random();
	
	for (int i=0; i<10; i++){
		arr[i] = rand.nextInt();
		
		}

	for (int i=0; i<10; i++){
		System.out.println(arr[i]);
	}
	}

}