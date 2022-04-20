package multithreadstest;

public class MultiThreadTest extends Thread {
	
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				Thread.sleep(1000);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(i);
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadTest t1 = new MultiThreadTest();
		MultiThreadTest t2 = new MultiThreadTest();
		MultiThreadTest t3 = new MultiThreadTest();
		
		t1.start();
		try {
			t1.join();
		} catch(Exception e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}

}
