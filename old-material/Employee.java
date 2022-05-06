import java.util.*;

public class Employee{

	String name;
	int age;
	String designation;
	int salary;

	public Employee(String EmpName){
	name = EmpName;
	}

	public void empAge(int EmpAge){
	age = EmpAge;
	}

	public void empDesignation(String empDesig){
	designation = empDesig;
	}

	public void empSalary(int empSal){
	salary = empSal;
	}

	public void printEmployee(){
	System.out.println("The employee name is: " + name);
	System.out.println("The employee AGE is: " + age);
	System.out.println("The employee DESIGNATION is: " + designation);
	System.out.println("The employee salary is: " + salary);
	}
}
