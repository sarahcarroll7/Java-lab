package summaries;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeData md = new MakeData(); 
//		double[] var = {1.5, 2.5, 0.5, 6.3, 5.5}; 
		double[] data = md.makeVar(10); 
//		System.out.println(Arrays.toString(data));
//		System.out.println(Arrays.toString(var)); 
//		Big5 bf = new Big5(); 
//		System.out.println(bf.max(var)); 
//		System.out.println(bf.min(var));
//		System.out.println(bf.median(var));
		for(double d: data) {
			System.out.println(d);
		}
		
		Big5 bf = new Big5();
		
		System.out.println("The first QD");
		System.out.println(bf.firstQ(data));
		System.out.println("The third QD");
		System.out.println(bf.thirdQ(data));
		
		Big7 bs = new Big7(); 
		
		System.out.println(bs.firstQ(data));
		System.out.println(bs.var(data));
	}

}
