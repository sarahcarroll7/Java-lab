package fileiooperations;

import java.io.FileOutputStream;

public class FileOutput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String data = "this is just a dummy data"; 
		
		FileOutputStream out = new FileOutputStream("D:\\work\\eclipsework\\output.txt"); 
		
		byte[] datatoread = data.getBytes();
		out.write(datatoread);
		System.out.println("The data got written to the file");
		
		out.close();
		
		
	}

}
