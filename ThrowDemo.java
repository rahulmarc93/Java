package exception;

public class ThrowDemo {
	static void checkAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("OOPS!!!You are not eligible for vote");
		}
		else
		{
			System.out.println("Yes...You are eligible for vote");
		}
	}

	public static void main(String[] args) {
		// Calling method
		checkAge(2);
	}
}
