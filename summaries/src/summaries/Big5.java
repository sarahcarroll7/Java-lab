package summaries;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;
import java.util.List; 

public class Big5 {
	
	double max(double[] var) {
		double maximum = var[0];   // start with the first value
	    for (int i=1; i<var.length; i++) {
	        if (var[i] > maximum) {
	            maximum = var[i];   // new maximum
	        }
	    }
	    return maximum;
	}
	double min(double[] var) {
		double minimum = var[0];   // start with the first value
	    for (int i=1; i<var.length; i++) {
	        if (var[i] < minimum) {
	            minimum = var[i];   // new maximum
	        }
	    }
	    return minimum;
	}
	double median(double[] var) {
		
		Arrays.sort(var);
		int n = var.length; 
		
        // check for even case
        if (n % 2 != 0)
            return (double)var[n / 2];
 
        return (double)(var[(n - 1) / 2] + var[n / 2]) / 2.0;
        
	}
	
	double firstQ(double[] var) {
		return percentile(var, 25); 
	}
	
	double thirdQ(double[] var) {
		return percentile(var, 75);
	}
	
	public static double percentile(double[] var, double percentile) {
	    Arrays.sort(var);
	    int index = (int) Math.ceil(percentile / 100.0 * var.length);
	    return var[index];
	}
}
