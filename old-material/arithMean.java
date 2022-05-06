import java.util.*;

public class arithMean {


	public void mean() {
	
	double sum = 0f, avg = 0f; 
	
	Scanner val = new Scanner(System.in);
	System.out.println("How many values, you want to input: ");
	
	int arrSize = val.nextInt();
	
	int[] arr = new int[arrSize]; 

	System.out.println("Input Values: ");
	
	for (int i=0; i<arrSize; i++){
		arr[i] = val.nextInt();
		sum += arr[i];
	}
	
	avg = (double) sum/arrSize; 
	
	System.out.println("The Array is: ");
	for (int i=0; i<arr.length; i++){
	System.out.println(arr[i]);
	}
	
	System.out.println("The Arithmetic Mean is: " + avg);
	}

public static void main(String[] args){

	arithMean myMean = new arithMean();

	myMean.mean();
}

}