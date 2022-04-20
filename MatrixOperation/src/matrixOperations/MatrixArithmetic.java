package matrixOperations;

import java.util.Arrays;

public class MatrixArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// input matrices
		
		int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int b[][] = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
		
		// container matrix
		
		int s[][] = new int[3][3];
		
		// addition 
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				s[i][j] = a[i][j] + b[i][j];
			}
			System.out.println();
		}
		
		
		for (int r[]: s) {
			System.out.println(Arrays.toString(r));
		} 
		
		/*
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(s[i][j]);
			}
			System.out.println();
		}*/
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				s[i][j] = a[i][j] - b[i][j];
			}
			System.out.println();
		}
		
		
		for (int r[]: s) {
			System.out.println(Arrays.toString(r));
		} 
		
		// multiplication (dot product)
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				s[i][j] = a[i][j] * b[i][j];
			}
			System.out.println();
		}
		
		
		for (int r[]: s) {
			System.out.println(Arrays.toString(r));
		} 
		
		// division 
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				s[i][j] = a[i][j] / b[i][j];
			}
			System.out.println();
		}
		
		
		for (int r[]: s) {
			System.out.println(Arrays.toString(r));
		} 
		
		// multiplication (cross product)
		

	}

}
