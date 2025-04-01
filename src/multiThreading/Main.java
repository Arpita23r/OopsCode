package multiThreading;

public class Main {
public static void main(String[] args) {
	MyThread t1=new MyThread();
	YourThread t2=new YourThread();
	t1.start();
	t2.start();
	
}
}
