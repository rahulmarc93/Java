package Operators;

public class LogicalOperator {
	public class LogicalOprtr {

		public static void main(String[] args) {
			int m=12;
			int n=54;
			if(m==n && n>m)
			{
				System.out.println("Result is true");
			}
			else
			{
				System.out.println("Result is false");
			}

			//OR
			if(m==n || n>m)
			{
				System.out.println("Result is true");
			}
			else
			{
				System.out.println("Result is false");
			}
		}

	}
}