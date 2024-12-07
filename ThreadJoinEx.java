package multithreading;

public class ThreadJoinEx extends Thread{
	private int number;
	public ThreadJoinEx (int number)
	{
		this.number=number;
	}
	@Override
	public void run() {
		int counter=0;
		int numInt=0;
		do {
			numInt=(int)(counter+10);
					System.out.println(this.getName()+"Prints"+numInt);
					counter++;
		}
		while(numInt!=number);
		{
			System.out.println("Correct!"+this.getName()+"Printed"+counter+"Times");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Starting Thread 1...");
		Thread t1=new ThreadJoinEx(15);
		t1.start();
		try
		{
			//waiting to die t1
			t1.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread are Interrupted");
		}
		System.out.println("Next thread will start to working");
		Thread t2=new ThreadJoinEx(20);
		t2.start();
		System.out.println("Main() is threading");
	}
}
