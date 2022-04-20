package csvtest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CsvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader in;
		double sum = 0.0; 
		int cnt = 0; 
		try {
			in = new FileReader("csvfiles/test.csv");
			Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(in);
			for (CSVRecord record : records) {
			    String id = record.get(0);
			    String value = record.get(1);
			    sum += Double.parseDouble(value);
			    cnt += 1; 
			    System.out.println(id + " " + value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + sum/(double)cnt);
	}

}
