package csvreader; 

import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;  
public class CsvReader {
	
	public static double mean(List<Double> x) {
		int sum = 0; 
		for (int i =0; i<x.size(); i++) {
			sum += x.get(i); 
		}
		return (double) (sum/x.size()); 
	}
	public static void main(String[] args) {
		String line = ""; 
		double sum = 0.0; 
		int cnt=0; 
		List<Double> x = new ArrayList(); 
		try {
			BufferedReader br = new BufferedReader(new FileReader("files/dummydata.csv"));
			while ((line = br.readLine()) != null) {
				String[] p = line.split(","); 
//				System.out.println(Arrays.toString(p));
//				System.out.println(p[1]);
//				sum += Double.parseDouble(p[2]);
//				cnt += 1;
				x.add(Double.parseDouble(p[2])); 
			}
//			double out = sum/cnt; 
			System.out.println(x);
			System.out.println(mean(x));
			
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		
	}
}  