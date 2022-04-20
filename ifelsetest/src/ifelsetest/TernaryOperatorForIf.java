package ifelsetest;

public class TernaryOperatorForIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double number = -2.0;
		String result;
		result = (number > 0)? "positive" : (number < 0)? "negative": "zero"; 
		System.out.println("the given number is :" + result);
	}

}
