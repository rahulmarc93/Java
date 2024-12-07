package oop;

class HumanBody
{
	public void dispalyHuman()
	{
	System.out.println("Method defined inside the Human Body class")	;
	}
}
interface Male
{
	public  void show();
}
interface FeMale
{
	public  void show();
}
//Single inheritance is child class derived from 1 parent class
//multiple inheritance is accessing more than 1 parent 
public class HybridDemo extends HumanBody implements Male,FeMale {

	@Override
	public void show() {
		System.out.println("Implimentation of show() method defined in the male and female interface");
		
	}
public void displayHybridDemo()
{
	System.out.println("Method defined in child class");
}

	public static void main(String[] args) {
		HybridDemo obj=new HybridDemo();
		obj.dispalyHuman();
		obj.displayHybridDemo();
		obj.show();

	}

}
