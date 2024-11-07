package methods;

public class StaticDemo {
		//static method can call directly without creating object
		static void display()
		{
			System.out.println("We are learning Java");
		}
		static void display(int a)
		{
			System.out.println("We are learning Java"+a);
		}
		static void display(int x,float y)
		{
			System.out.println(y/x);
		}

		public static void main(String[] args) {
			display();
			display(8);
			display(12,67.9f);
	}
}