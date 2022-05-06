import java.util.Random;

public class NumberList{

private static double[] anArr;

public static double[] list() {

	anArr = new double[10];

	for (int i=0; i<10; i++){

		anArr[i] = randomFill();

		}
	return anArr;
	}

public static double randomFill(){

	Random rand = new Random();
	int randomNum = rand.nextInt();
	return randomNum;

	}

public static void main(String[] args){


System.out.println(list() + "\n");


}


}