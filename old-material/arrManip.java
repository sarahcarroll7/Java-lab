import java.util.*;
import java.io.*;

class arrManip {

	public static void main(String[] args){

	char[] copyFrom = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'};
	
	int size = copyFrom.length;

	char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 5, + size);

 	System.out.println(new String(copyTo));
	
	// System.out.println("The size of the factor is: " + copyFrom.size());
	
	// System.out.println(+ size);	

	}
}
