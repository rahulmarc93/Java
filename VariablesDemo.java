package variables;
class Student
{
	
	// Instance Var
				String name="Nishitha";
				double fees=1000;
				public void show()
				{
				
					System.out.println("This is an example of instance variable");
				}
}

public class VariablesDemo {
	

	public static void main(String[] args) {
		Student obj=new Student();//Constructor
		System.out.println(obj.name);
		obj.fees=2000;
		System.out.println("Student fees is:"+obj.fees);
		
		obj.show();
		
		
		

	}

}