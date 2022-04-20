/**
 * licence 2020 @ learningfig.org
 * 
 * @author Dr. M. Kamaskhaiah
 * 
 */

package studentsdata;

/** 
 * requires hashmap library
 */
import java.util.HashMap;
import java.util.Random;

/**
 * class for recording and creting student data
 * @author Dr. M. Kamakshaiah
 *
 */
class StudentData {
	
	
	/**
	 * Input fields
	 */
	String fname;
	String lname;
	String email;
	int age; 
	int numSub;
	int totalMarks; 
	
	
	/**
	 * sets name 
	 * @param firstname
	 * @param lastname
	 * 
	 * @return studentinfo
	 */
	String setName(String firstname, String lastname) {
		this.fname = firstname;
		this.lname = lastname;
		
		/**
		 *  creates email using 
		 *  @param fistname and @param lastname
		 *  
		 */
		String email = firstname + "." + lastname + "@gitam.edu"; 
		HashMap<String, String> studentinfo = new HashMap<>();
		
		Random rand = new Random();
		String regno = String.valueOf(rand.nextInt()); 
		
		/** 
		 * @return studentinfo which is a hashmap 
		 */
		studentinfo.put("reg no", regno);
		studentinfo.put("Student Email", email);
		
		/** 
		 * @return studentinfo 
		 */
		return studentinfo.toString(); 
	}
	
	/**
	 * 
	 * @param age
	 */
	void setAge (int age) {
		this.age = age;
	}
	
	/**
	 * 
	 * @param subjects
	 */
	void setSubjects (int subjects) {
		this.numSub = subjects;
	}
	
/**
 *  
 * @param totalmarks
 */
	void setTotalMarks(int totalmarks) {
		this.totalMarks = totalmarks;
		
	}
	
	/**
	 * prints result 
	 */
	void Result() {
		if (this.totalMarks < 40) {
			System.out.println("Failed");
			} 
		else if (this.totalMarks > 40 && this.totalMarks < 100) {
			System.out.println("Passed");
			}
			
	}
}
