package constructorTypes;

public class NoArgCons {
	String name;
	
	NoArgCons()
	{
		name="Anudip Foundation";
	}
	public static void main(String[] args) {
		// 1.Default 2.No argument 3.Parameterised
		
		NoArgCons obj=new NoArgCons();
		System.out.println("Company name is:"+obj.name);
	}
}