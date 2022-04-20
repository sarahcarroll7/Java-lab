package csvfileimport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVFileImport {
	
	public static void csvfileimport(String filepath, int index) {
		File file = new File(filepath);
		
		try {
			Scanner inputData = new Scanner(file);
			inputData.next();
			while(inputData.hasNext()) {
				
				String data = inputData.next(); 
				String[] values = data.split(","); 
				System.out.println(values[(index-1)]); 
			}
			inputData.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		csvfileimport("data/emp-salary.csv", 3);  

	}

}
