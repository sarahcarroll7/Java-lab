package polymorph;

public class ArithmeticCalcB extends ArithmeticCalc{
	
	
	@Override
	void sum (int a, int b) {
		
		System.out.println("The sum in ArithmeticCalcB is: " + (a + b ));
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 
		ArithmeticCalcB arithChild = new ArithmeticCalcB();
		ArithmeticCalc arith = new ArithmeticCalcB(); 
		
		System.out.println(arithChild.getClass());
		System.out.println(arith.getClass());
		System.out.println(arith.equals(arithChild));
		System.out.println(arithChild.equals(arith));
		arithChild.sum(1,  2);
	}
}
