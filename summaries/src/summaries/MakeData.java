package summaries;
import java.lang.Math; 

public class MakeData {
	double[] makeVar(int n) {
		double[] values = new double[n]; 
//		double value = Math.random(); 
		
		for (int i=0; i<n; i++) {
			values[i] = Math.ceil(Math.random()*10); 
		}
		return values;
		
	}
}
