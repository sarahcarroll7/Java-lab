import java.util.Random; 
import java.lang.Math;

class twoDarr{
	public static void main(String[] args){
	
	double[][] b = new double[5][5]; 
	
	Random rand = new Random(); 
	
	
	for(int r = 0; r < b.length; r++){
		for(int c = 0; c < b[r].length; c++){
		double n = Math.round(Math.random()*100); 		
		b[r][c] = n;	
			}
		}
	
	for(int r = 0; r < b.length; r++){
		for(int c = 0; c < b[r].length; c++){
			System.out.print("\t" + b[r][c]);			   
							
			}
		System.out.println(); 
		}
	
	}

}
