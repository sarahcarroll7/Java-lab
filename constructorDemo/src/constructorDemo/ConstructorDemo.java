package constructorDemo;

public class ConstructorDemo {
	
	ConstructorDemo(){
		System.out.println("this statement is printed by the constructor!");
	}
	
	static void print() {
		System.out.println("this statement is printed by class method!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo ctr = new ConstructorDemo(); 
		ctr.print();
	}

}
