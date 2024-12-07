package exception;

public class FinallyDemo {

	public static void main(String[] args) {
		try
		{
		String arr[]= {"Pratiksha","Nilesh","Ashish","Sonam"};
		System.out.println(arr[10]);
		}catch(ArithmeticException e)
		
		{
			System.out.println(e);
		}
		catch(Exception f)
	{
			System.out.println("oops!!!Name not found");
		}
		finally
		{
			System.out.println("The finally Statement let you execute code after" +"try catch,"+"Regardless of the result" );	
		}
	}
}
