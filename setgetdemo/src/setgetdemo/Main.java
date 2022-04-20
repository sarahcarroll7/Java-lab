package setgetdemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		
		emp.setId(001);
		emp.setName("Kamakshaiah", "Musunuru");
		emp.setQual("MBA");
		emp.setSalary(100000);
		
		emp.getName();
		String email = emp.getEmail();
		System.out.println(email);
		emp.getProfile();
	}

}
