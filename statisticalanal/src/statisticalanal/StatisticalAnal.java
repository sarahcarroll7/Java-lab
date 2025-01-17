package statisticalanal;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class StatisticalAnal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get a DescriptiveStatistics instance
		double[] arr = new double[10]; 
		
		DescriptiveStatistics stats = new DescriptiveStatistics();

		// Add the data from the array
		for( int i = 0; i < arr.length; i++) {
		        stats.addValue(arr[i]=i);
		}

		// Compute some statistics
		double mean = stats.getMean();
		double std = stats.getStandardDeviation();
		double median = stats.getPercentile(50);
		System.out.println(mean);
		System.out.println(std);
		System.out.println(median);
	}

}
