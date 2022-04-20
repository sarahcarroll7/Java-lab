package univariatestatistics;

import java.util.Arrays;

public class Data {
	public Double[] makeData(int n) {
		Double[] data = new Double[n]; 
		for(int i=0; i < n; i++) {
			data[i] = Math.ceil(Math.random()*100); 
		}; 
		return data; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data(); 
		System.out.println(Arrays.toString(d.makeData(5)));
	}

}
