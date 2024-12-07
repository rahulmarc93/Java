package multithreading;

public class ThreadCreation {

	public static void main(String[] args) {
		// Creating Thread
		Thread t1=new Thread("thread1");
		Thread t2=new Thread("thread2");
		t1.start();
		t2.start();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());//Normal Priority---5, Min--1,Max--10
	}
}
