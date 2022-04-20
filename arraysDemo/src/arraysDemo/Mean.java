package arraysDemo;

public class Mean {
	static double mean(double[] nums, String type) {
		
		double avg = 0; 
		
		switch(type) {
		case "am": {
			double sum = 0.0;
			for (double n: nums) {
				sum += n;
			}
			avg = sum/nums.length; 
			break;
		}
		
		case "gm": {
			double prod = 1; 
			for (double n: nums) {
				prod *= n;
			}
			avg = java.lang.Math.pow(prod, 1/nums.length);
			break;
		}
		
		case "hm": {
			double resip = 0; 
			for (double n: nums) {
				resip += 1/n;
			}
			avg = nums.length/resip; 
			break;
		}
		default: 
			
		}
		return avg; 
		
	}
}
