package enterprise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Random;

public abstract class Employee {
	
	int id; 
	String fname;
	String lname; 
	String name;
	String typeOfTheEmployee;
	int age;
	double salary, base, da, hra, perks, incentives;
	int contactInfo;
	int address;
	String qualification;
	String performance; 
	String designation;
	
	public abstract void setEmpID(); 
	
	void setName(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		this.name = "fname" + " " + "lname";
	}
	
	void getEmail() {
		System.out.println((this.fname + "."+ this.lname + "@email.com"));
	}
	
	void setPerformance(String perf) {
		this.performance = perf;
		
	}
	
	String getPeformance() {
		return this.performance;
	}
	
	void setAge(int age) {
		this.age = age;
		
	}
	
	void ComputeSalary(int base, int hra, int da) {
		this.base = base;
		this.da = da;
		this.hra = hra;
		if (this.typeOfTheEmployee == "lower") {
				this.perks = 0.1;
		}
		else if (this.typeOfTheEmployee == "middle"){
			this.perks = 0.2; 
		}
		else {
			this.perks = 0.3; 
		}
		
		double Salary = this.base + this.da + this.hra; 
		double perkspart = Salary * perks; 
		double SalaryFinal = Salary + perkspart;  
		
		this.salary = SalaryFinal; 
		
		HashMap wholesal = new HashMap();
		
		wholesal.put("salary", Salary);
		wholesal.put("perks", perkspart);
		wholesal.put("Total Salary", SalaryFinal);
		
		System.out.println(wholesal); 
		
	}
	
	void ComputeIncentives(String perf) {
		if (perf == "poor") {
			this.incentives = this.salary * 0; 
		} else {
			this.incentives = this.salary * 0.2; 
		}
		
		System.out.println(this.incentives); 
	}
	
	void Experience() {
		
		String joindate = "1999-04-01";
		
		LocalDate joinDate = LocalDate.parse(joindate); 
		LocalDate today = LocalDate.now();
		
		Long NoOfYears = ChronoUnit.YEARS.between(joinDate, today); 
		
		System.out.println(NoOfYears); 
		
	}
	
	

}