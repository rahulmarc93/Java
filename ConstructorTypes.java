package constructorTypes;

import java.util.Scanner;

public class ConstructorTypes {
			//Constructor
			ConstructorTypes()
			{
				
			}
			//fields or states of a class-all the variables depends on the class Employee itself
			int id;
			String ename;
			int age;
			double salary;
			//behaviour of class(method)
			void enterValue()
			{
				//To take User input
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your id:");
				id=sc.nextInt();
				System.out.println("Enter your name:");
				ename=sc.next();
				System.out.println("Enter your age:");
				age=sc.nextInt();
				System.out.println("Enter your salary:");
				salary=sc.nextDouble();
				sc.close();
			}
		//method definition
			void show()
			{
				System.out.println(" id:"+id);
				System.out.println(" name:"+ename);
				System.out.println(" age:"+age);
				System.out.println(" salary:"+salary);
			}
			public static void main(String[] args) {
				ConstructorTypes obj=new ConstructorTypes();
				//calling method
				obj.enterValue();
				obj.show();
			}
}