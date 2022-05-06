	import java.util.*;

public class EmpTest{

	public static void main(String args[]){
	
	Employee empone = new Employee("MK");
	Employee emptwo = new Employee("Sukanya");

	empone.empAge(40);
	empone.empDesignation("Asst.Prof");
	empone.empSalary(53000);
	empone.printEmployee();

	emptwo.empAge(38);
	emptwo.empDesignation("Asst.Prof");
	emptwo.empSalary(53000);
	emptwo.printEmployee(); 
	}

}
