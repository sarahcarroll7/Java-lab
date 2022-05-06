import java.util.Scanner;

class switchEx{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int s = 0;

		System.out.println("Enter your choice: ");
		s = scan.nextInt();

		switch(s){
			case 1: System.out.println("you want to try AM"); break;
			case 2: System.out.println("you want to try GM"); break;
			case 3: System.out.println("you want to try HM"); break;
			default: System.out.println("your input is invalid"); break;
			}
		}

	}
