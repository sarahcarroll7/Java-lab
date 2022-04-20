package enterprise;

import java.util.Random;

public class Executive extends Employee {
	
	String typeOfTheEmployee = "lower";
	
	public void setEmpID() {
		Random rnd = new Random();
		this.id = rnd.nextInt(10000); 
		System.out.println(this.id + "-exep");
		
	}
	
	void setTypeOfTheEmployee() {
		super.typeOfTheEmployee = this.typeOfTheEmployee;
		System.out.println(super.typeOfTheEmployee);
	}
	
	

}
