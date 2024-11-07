package methods;

public class DiffReturns {

		void main()
		{
			System.out.println("Main method is not return anythin");
		}
		int main(int a)
		{
			return a/2;
		}
		String main(String a,String b)
		{
			return a.concat(b);
		}
	float main(float x,float y,float z)
	{
		return x*y*z;
	}
		public static void main(String[] args) {
			DiffReturns obj=new DiffReturns();
			obj.main();
			System.out.println(obj.main(50));
			System.out.println(obj.main("Good", "Afternoon"));
			System.out.println(obj.main(12.4f, 34.6f, 78.1f));
	}
}
