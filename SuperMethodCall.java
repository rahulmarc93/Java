package multithreading;

class Fruits
{
	void eat()
	{
		System.out.println("We can eat fruits");
	}
}
class Mango extends Fruits
{
	void eat()
	{
		System.out.println("We can eat Mango..It will be tasty...");
	}
	void Drink()
	{
		
			System.out.println("We can make juice with Mango");
		}	
	void superMthd()
	{
		super.eat();
	}
}
public class SuperMethodCall {

	public static void main(String[] args) {
		Mango m=new Mango();
		m.eat();
		m.Drink();
		m.superMthd();

	}

}
