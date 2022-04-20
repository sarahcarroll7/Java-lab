package ifelsetest;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
		Double num1, num2, result=null; 
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Operator pls? (+, -, *, /): ");
		operator = sc.next().charAt(0); 
		System.out.println("Enter numbers ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		switch(operator) {
		case '+':
			result = num1 + num2; 
			break; 
		case '-':
			result = num1 - num2; 
			break; 
		case '*':
			result = num1 * num2; 
			break; 
		case '/':
			result = num1 / num2; 
			break; 
		}
		
		System.out.println(result); 
		
	}

}
