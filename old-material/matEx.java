import java.util.Scanner;

class matEx {

	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	int[][] Array;

	System.out.println("Input rows: ");
	int m = 0; 	
	m = scan.nextInt();
	
	System.out.println("Input cols: ");
	int n = 0; 
	n = scan.nextInt();

	Array = new int[m][n];
	for(int i = 1; i < m; i++){
		for(int j=1; j < n; j++){
		Array[i][j] = i*j;
		System.out.println(Array[i][j]);		
	break;
	}	

	}

	
	
	}
}
