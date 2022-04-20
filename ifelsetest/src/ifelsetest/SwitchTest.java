package ifelsetest;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3; 
		String day; 
		
		switch(num) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid input";
			break;
		}
		System.out.printf("The day for %d is %s", num, day);
	}
}