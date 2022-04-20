package statistics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.math3.stat.Frequency;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.apache.commons.math3.stat.regression.SimpleRegression;

public class StatTest {
	
	public static double[] makeData(int n) {
		double[] x = new double[n]; 
		for (int i =0; i < n; i++) {
			x[i] = Math.ceil(Math.random()*100); 		
		}
		return x; 
	};
	
	public static double[][] make2DArray(int n, int m){
		
		double[][] arr = new double[n][m]; 
		for (int i=0; i < n; i++) {
			for (int j=0; j < m; j++) {
				arr[i][j] = Math.ceil(Math.random()*100); 
			}
		}
		return arr; 
	}; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Double[] x = {1.0, 2.0, 3.0, 4.0};
		double[] x = makeData(5); 
		
		DescriptiveStatistics stats = new DescriptiveStatistics();
		
		for(int i = 0; i < x.length; i++) {
			stats.addValue(x[i]);;
		}
		
//		double mean = StatUtils.mean(x); 
//		System.out.println(Arrays.toString(x));
//		System.out.println(stats.getMean());
//		System.out.println(stats.getStandardDeviation());
//		System.out.println(stats.getPercentile(50));
		
		SummaryStatistics st = new SummaryStatistics(); 
		String line = ""; 
		
		Frequency fr = new Frequency(); 
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("files/dummydata.csv"));
			try {
				while((line = br.readLine()) != null) {
					
//					System.out.println(line.split(",")[3]);
//					st.addValue(Double.parseDouble(line.split(",")[2]));
					fr.addValue(line.split(",")[3]);
				}
//			System.out.println(st.getMean()); 
//			System.out.println(st.getStandardDeviation());
//				System.out.println(fr.getCount("male"));
//				System.out.println(fr.getCount("female"));
//			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			System.out.println(StatUtils.mean(x));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		double[][] data = make2DArray(5, 2); 
		System.out.println(Arrays.deepToString(data));
		
		SimpleRegression sr = new SimpleRegression(); 
		sr.addData(data); 
		System.out.println("Intercept: " + sr.getIntercept() + " Slope: " + sr.getSlope());
		
		
	}

}
