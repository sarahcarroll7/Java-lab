package arraysDemo;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
		double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double sum = 0; 
		
		Mean m = new Mean(); 
		double avg = m.mean(numbers, "hm"); 
		System.out.println(avg); 
	}

}
