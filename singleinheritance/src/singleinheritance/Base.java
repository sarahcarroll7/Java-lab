package singleinheritance;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class Base {
	Double[] data(int n) {
	
		Random rd = new Random(); // creating Random object
	      Double[] arr = new Double[n];
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = rd.nextDouble(); // storing random integers in an array
	      }
	    return arr; 
	}
	
	double mean(Double[] data) {
		
		Double[] newData = new Double[data.length];
		double sum = 0; 
		for (int i = 0; i < data.length; ++i) {
			newData[i] = data[i];
			sum += newData[i]; 
		}
		return sum/(double)newData.length; 
	}
	
	double variance(Double[] data) {
		Double[] newData = new Double[data.length];
		double sum = 0; 
		
		for (int i = 0; i < data.length; ++i) {
			newData[i] = Math.pow(data[i] - mean(data), 2);
			sum += newData[i]; 
		}
		return sum; 
	}
	
	double stanDev(Double[] data) {
		Double[] newData = new Double[data.length];
		double out = variance(data); 
		return Math.pow(out, 0.5); 
	}
}
