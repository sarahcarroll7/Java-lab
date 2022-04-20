package setgetdemo;

public class Employee {
	int id; 
	String fname;
	String lname; 
	String qual;
	int salary; 
	
//	setters 
	
	void setId(int id) {
		this.id = id; 
	}
	
	void setName(String fname, String lname) {
		this.fname = fname;
		this.lname = lname; 
		 
	}
	
	void setQual(String qual) {
		this.qual=qual; 
	}
	
	public void setSalary(int sal) {
		this.salary = sal; 
	}
	
//	getters
	
	void getId() {
		System.out.println(this.id); 
	}
	
	void getName() {
		System.out.println(fullName()); 
	}
	
	void getQual() {
		System.out.println(this.qual); 
	}
	
	void getSalary() {
		System.out.println(this.salary); 
	}
	
	String fullName() {
		return fname + " " + lname; 
	}
	
	String getEmail() {
		return this.fname +"."+ this.lname + "@" + "gitam.edu";
	}
	
	void getProfile() {
		System.out.println("This employee's id is: " + this.id + ";" + "His qualification is: " + this.qual); 
	}
}
