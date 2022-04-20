package unianalysis;

import java.util.Arrays;

public class UniAnalysis {
	UniAnalysis(int[] i){
		System.out.printf("The input data is: %s", Arrays.toString(i)); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {1, 2, 3, 4, 5}; 
		UniAnalysis ua = new UniAnalysis(i);  
	}

}
