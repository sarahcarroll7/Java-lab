import java.util.*;

class mapEx{

	public static void main(String args[]){

	HashMap hm = new HashMap();	

	hm.put(41, "M Kamakshaiah");
	hm.put(39, "M Sukanya");
	hm.put(10, "M Yoga Amrutha");
	hm.put(6, "M Sai Bhargav");

	for(Map.Entry m:hm.entrySet()){
		System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
