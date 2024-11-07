package methods;

public class MethodsDemo {
		//MethodOverloading is same method we are using in same class with different arguments/signature
	int mul(int a,int b)
	{
		return a*b;
	}
	int mul(int a,int b,int c)
	{
		return a*b*c;
	}
	int mul(int a)
	{
		return a*a;
	}

	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(float a,float b) {
		System.out.println(a+b);
	}
		public static void main(String[] args) {
			MethodsDemo obj = new MethodsDemo();
			System.out.println(obj.mul(2, 2));
			System.out.println(obj.mul(2, 2, 2));
			System.out.println(obj.mul(10));
		}
}