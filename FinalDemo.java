package exception;

/*
 * final var----stop to change value
 *final method---stop overriding
 *final class---stop Inheritance
 */
 final class A
{
	final int x=90;
	final void run()
	{
		
	}
}
public class FinalDemo {
	final void run()
	{
		
	}

	public static void main(String[] args) {
		A obj=new A();
		//obj.x=45;cant change value because it is a final var

	}

}