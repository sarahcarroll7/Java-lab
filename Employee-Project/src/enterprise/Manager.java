package enterprise;

import java.util.Random;

public class Manager extends Employee {
	
	String typeOfTheEmployee = "manager";
	
	
	public void setEmpID() {
			Random rnd = new Random();
			this.id = rnd.nextInt(10000); 
			System.out.println(this.id + "-mark");
			
	}
	
	public void getTypeOfTheEmployee() {
		super.typeOfTheEmployee = this.typeOfTheEmployee;
		System.out.println(super.typeOfTheEmployee); 
	}

}
