package threadexample;

public class ThreadExample extends Thread {
	public void run() {
		System.out.println("I am a thread!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample te = new ThreadExample(); 
		te.run();
	}

}
