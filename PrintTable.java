package multithreading;

//User created thread should be extended from Thread class or Runnable interface
class Table
{
	synchronized void PrintTabl(int n)
	{
		for(int i=1;i<=15;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}

class Thread1 extends Thread
{
	Table tbl1=new Table();
	int number;
	
	Thread1( Table tbl1,int number)
	{
		this.tbl1=tbl1;
		this.number=number;
	}
	public void run()
	{
		tbl1.PrintTabl(number);
	}
	
}
public class PrintTable {

	public static void main(String[] args) {
		Table tbl1=new Table();
		Thread1 t1=new Thread1 (tbl1,7);
		Thread1 t2=new Thread1 (tbl1,8);
		Thread1 t3=new Thread1 (tbl1,9);
		t1.start();
		t2.start();
		t3.start();
	}
}
