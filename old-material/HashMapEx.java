import java.util.HashMap;
import java.util.Map;

class hashmapex{

	public static void main(String args[]){

		Map vehicles = new HashMap(); 
		vehicles.put("Maruti", 2); 
		vehicles.put("Benz", 4);
		vehicles.put("Mahindra", 5);

		System.out.print("\t" + vehicles);
		//for(String key: vehicles.keySet()){
		
		String searchKey = "Audi";
		if(vehicles.containsKey(searchKey))
			System.out.println("Found total " + vehicles.get(searchKey) + " "
					+ searchKey + " cars!\n");
		
// 		String searchkey = "Maruti";

//		if(vehicles.containsKey(searchkey));
//		System.out.println("Total " + vehicles.get(searchkey) + " vehicles " + searchkey + " found");

		
	}
//System.out.println();
}
