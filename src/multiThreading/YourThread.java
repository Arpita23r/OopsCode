package multiThreading;

public class YourThread extends Thread {
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Your class running");
			}
		
	}
}
