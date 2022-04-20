package studentsdata;

/** 
 * this is a test case for the class StudentData
 * @author Dr. M. Kamakshaiah
 * @return student object
 *
 *
 */

public class StudTest {

	public static void main(String[] args) {
		
		StudentData student = new StudentData(); 
		
		/**
		 * Test for StudentData 
		 */
		
		String email = student.setName("Kamakshaiah", "Musunuru");
		System.out.println(email);
		
		student.setAge(45);
		student.setSubjects(6);
		student.setTotalMarks(35);
		
		student.Result();
		
		
	}

}
