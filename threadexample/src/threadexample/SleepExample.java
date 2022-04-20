package threadexample;

public class SleepExample extends Thread{
	private int i;
	SleepExample(int i){
		this.i = i; 
	}
	
	SleepExample(String name){
		
	}
	
	SleepExample(Double age){
		
	}
	public void run() {
		for (int i =0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepExample se1 = new SleepExample(1);
		SleepExample se2 = new SleepExample("mk");
		SleepExample se3 = new SleepExample(45);
		se1.start();
		se2.start(); 
		se3.start(); 
	}

}
