package enterprise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Random;

public class CSVReader {
	
	public static ArrayList<Integer> CsvFileRead(String path, int index) {
		
		String line = ""; 
		//ArrayList<String> data = new ArrayList<String>(); 
		ArrayList<Integer> dataOut = new ArrayList<Integer>(); 
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			br.readLine(); 
			while((line = br.readLine()) != null) {
				
				String[] values = line.split(","); 
				dataOut.add(Integer.parseInt(values[index]));
				// System.out.println(values[2]); 
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataOut; 
			
	}
	
	public static void csvFileWriteString(String str, String outputfilename) {
				
		String out = str; 
				
		try {
			FileWriter file = new FileWriter(outputfilename);
			BufferedWriter bw = new BufferedWriter(file); 
			
			bw.write(out);
			bw.flush();
			System.out.println("Data flushed!");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void csvFileWrite(String path) {
		
		FileWriter file;
		try {
			file = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(file); 
			
			Random rnd = new Random();
			ArrayList<Integer> dataOut = new ArrayList<Integer>(); 
			 
			for(int i = 0; i <= 10; ++i) {
				dataOut.add(rnd.nextInt(100000)); 
			}
			
//			System.out.println(dataOut);
			bw.write(String.valueOf(dataOut));
			bw.flush(); bw.newLine(); 
			System.out.println("Data flushed!"); 
			bw.close();
				 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		// System.out.println(dataOut);  
	}
	
	public static void main(String[] args) {
		
		// test for csvfileimport
		
		
		/*
		 * ArrayList<Integer> dataNew = new ArrayList<Integer>();
		 * dataNew.addAll(CsvFileRead("data/emp-salary.csv", 2));
		 * 
		 * 
		 * 
		 * CsvFileRead("data/emp-salary.csv"); System.out.println(dataNew);
		 */  
		/*
		 * double sum = 0;
		 * 
		 * for (Integer val: dataNew) { sum += val; } double avg = sum / dataNew.size();
		 * System.out.println(avg);
		 */
		
		// test for csvFileWriteString for string
		
//		 csvFileWriteString("this is just a string", "data/outputstringdata.csv");
		
		// test csvFileWrite
		
		csvFileWrite("data/output.csv");
		
	}	

}
