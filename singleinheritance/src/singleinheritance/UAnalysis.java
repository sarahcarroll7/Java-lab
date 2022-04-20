package singleinheritance;

import java.util.Arrays;

public class UAnalysis extends Base {
	Double[] data; 
	void makeData(int n) {
		
		Double[] data = super.data(n); 
		this.data = data; 
	}
	
	void printData(int n){
		System.out.println(Arrays.toString(super.data(n))); 
	}
	
}
