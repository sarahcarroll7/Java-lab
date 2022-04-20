package p1;

public class A {
	public static void display() {
		System.out.println("this method is called from class A.");
	}
	
	public static void greet() {
		System.out.println("Hi I am suppose to greet you! and how are you?");
	}
	
	public static void main(String[] args) {
		A obj = new A();
		// obj.display(); 
		greet(); 
	}
}
