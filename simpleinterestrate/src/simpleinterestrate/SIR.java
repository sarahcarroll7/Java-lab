package simpleinterestrate;

public class SIR {
	
	static float sir(int p, int t, double d) {
		float result;
		result = (float) ((p*t*d)/100);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 10000;
		float out = sir(p, 3, 0.5);
		System.out.println(p + out); 
	}

}
