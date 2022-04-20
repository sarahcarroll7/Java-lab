package fileiooperations;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileIOOperations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] array = new byte[100];
		
		InputStream input = new FileInputStream("D:\\work\\eclipsework\\text.txt");
		System.out.println("The file size is: " + input.available());
		input.read(array);
			
		System.out.println("The file has been imported!");
			
		String data = new String(array); 
		System.out.println(data); 
		input.close(); 
			
		
	}

}
