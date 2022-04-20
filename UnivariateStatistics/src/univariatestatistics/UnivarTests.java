package univariatestatistics;
import java.util.Arrays;

public class UnivarTests {
	
	public static double oneSampleTTest(Double[] data) {
		Summaries s = new Summaries(); 
		double numerator = s.dev(data, s.mean(data), true);
		double denominator = Math.pow(s.std(data), 0.5); 
		
		return numerator/denominator; 
	}
	
	public static String normalityTest(Double[] data) {
		Double[] out = new Double[2]; 
		double sk = Summaries.skew(data); 
		double kr = Summaries.kurt(data);
		out[0] = sk; 
		out[1] =  kr; 
		return Arrays.toString(out); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data(); 
		Double[] data = d.makeData(10); 
		UnivarTests ut = new UnivarTests(); 
		System.out.println(ut.oneSampleTTest(data)); 
		System.out.println(ut.normalityTest(data));
	}

}
