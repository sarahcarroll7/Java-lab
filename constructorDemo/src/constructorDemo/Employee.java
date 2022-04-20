package constructorDemo;

public class Employee extends Person{
	Employee(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	int salary; 
	void setSalary(int sal) {
		this.salary = sal; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("mk", 45);
		System.out.println();
		Employee e = new Employee("ms", 43); 
		
		e.setSalary(100000);
		System.out.println(); 
		System.out.println(e.salary); 
		
	}

}
