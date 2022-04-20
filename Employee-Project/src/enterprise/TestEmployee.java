package enterprise;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Executive executive = new Executive();
		
		executive.setEmpID();
		executive.setName("abcd", "efgh");
		executive.getEmail();
		
		System.out.println(executive.typeOfTheEmployee);
		
		Manager manager = new Manager();
		manager.setEmpID();
		
		manager.setName("ijkl", "mnop");
		manager.getEmail();
		
		System.out.println(manager.typeOfTheEmployee);
		
		
	}

}