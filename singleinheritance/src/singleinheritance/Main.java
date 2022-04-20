package singleinheritance;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Base b = new Base(); 
//		Double[] data = (Double[]) b.data(5); 
//		
////		mean here
//		System.out.println(b.mean(data));
//		System.out.println(b.variance(data));
//		System.out.println(b.stanDev(data));
		
		UAnalysis ua = new UAnalysis(); 
//		ua.printData(5); only for testing 
		ua.makeData(5);
//		System.out.println(Arrays.toString(ua.data)); 
		System.out.println(ua.mean(ua.data));
	}

}
