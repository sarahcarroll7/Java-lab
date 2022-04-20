package summaries;

public class Big7 extends Big5 implements MCT, MD {
	
	double mean(double[] data) {
		return 0.0; 
	}
	
	@Override
	public double var(double[] data) {
		return 0; 
	} 
	
	@Override
	public double std(double[] data) {
		return 0; 
	} 
	
	@Override
	public double cov(double[] data) {
		return 0; 
	}

	@Override
	public double mean(double[] data, String type) {
		// TODO Auto-generated method stub
		return 0;
	}
}
