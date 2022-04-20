package csvfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvFileEditing {
	
	public static void csvfileimport(String filename, int index) {
		File file = new File(filename);
		
		try {
			Scanner inputStream = new  Scanner(file);
			inputStream.next();
			while (inputStream.hasNext()) {
				String data = inputStream.next();
				String[] values = data.split(","); 
				System.out.println(values[index]);
			}
			inputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		csvfileimport("data/emp-salary.csv", 2); 
		
	}

}
