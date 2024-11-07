package constructorTypes;

public class ConsOverloading {
//Constructor will accept the value
	String Language;//instance var
	ConsOverloading(String Language)//lang Local var
	{
		this.Language=Language;
		System.out.println(Language+" is a "+"Programming Language");
		
		
	}
	public static void main(String[] args) {
		ConsOverloading L1 = new ConsOverloading("Java");
		ConsOverloading L2 = new ConsOverloading("Python");
		ConsOverloading L3 = new ConsOverloading("Jakarta");
	}
}
