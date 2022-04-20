package univariatestatistics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Summaries {
	
	public static double dev(Double[] data, double value, boolean s) {
		Double[] dev = new Double[data.length]; 
		double sumdev = 0.0;
		
		for(int i=0; i<data.length; i++) {
			dev[i] = value - data[i];  
		}
		if (s) {
			for(int i=0; i<dev.length; i++) {
				sumdev += dev[i];
			}			
		}
		
		return sumdev; 
	}
	
	public static double moment(Double[] data, double m) {
			 
			double mnt = dev(data, mean(data), true); 
			double mntout = Math.pow(mnt, m); 
			return mntout; 
	}
	
	public static double mean(Double[] data) {
		double sum = 0.0;
		for(double i: data) {
			sum += i; 
			
		}
		return sum/data.length; 
	}
	
	public static double var(Double[] data) {
		Double value = 0.0; 
		Double[] sumdev = new Double[data.length];  
		double sumsqrs = 0; 
		for(int i= 0; i<data.length; i++) {
			sumdev[i] = (double) (i-mean(data)); 
			sumsqrs += Math.pow(sumdev[i], 2.0); 
		}
		return sumsqrs; 
	}
	
	public static double std(Double[] data) {
		double stdvalue = 0.0; 
		stdvalue = Math.pow(var(data), 0.5); 
		return stdvalue; 
	}

	public static double skew(Double[] data) {
		double numerator = moment(data, 3.0); 
		double denominator = Math.pow(std(data), 3.0); 
		return numerator/denominator; 
	}
	
	public static double kurt(Double[] data) {
		double numerator = moment(data, 4.0); 
		double denominator = Math.pow(std(data), 4.0); 
		return numerator/denominator; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Summaries s = new Summaries(); 
		Data d = new Data(); 
		Double[] data = d.makeData(10); 
		System.out.println(s.mean(data));
		System.out.println(s.var(data));
		System.out.println(s.std(data));
		System.out.println(s.dev(data, mean(data), true));
		System.out.println("Sum of devs is: ");
		
	}
	
	

}
