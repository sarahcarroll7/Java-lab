package employee;

public class P1 extends P2 implements Emp {
	
	int age = 0; 
	double salary = 0;
	double bonus=0;
	boolean inc; 
	
	void setInfo(int age, double salary) {
		this.age = age; 
		this.salary = salary; 
	}
	public void printAge() {
		System.out.println(this.age); 
		
	}
	public void printSalary() {
		System.out.println(this.salary); 
		
	}
	double computeBonus(double profits) {
		 
		if (profits >= 100000.0) {
			this.bonus = profits * 0.1; 
		} else {
			this.bonus = 0;
		}
		return bonus; 
	}
	public void printBonus() {
		System.out.println(this.bonus);
	}
	@Override
	public void incentives() {
		// TODO Auto-generated method stub
		
	}
	
}
