package oop;

class Car
{
	public Car()
	{
		System.out.println("Class:Car");
	}
	public void vehicleType()
	{
		System.out.println("Vehicle Type:Car");
	}
}
class Maruti extends Car
{
	public Maruti()
	{
		System.out.println("Maruti Class");	
	}
	public  void brand()
	{
		System.out.println("Brand:Maruti");
	}
	public void speed()
	{
		System.out.println("Max speed:100kmph");
	}
}
class Maruti800 extends Maruti
{
	
	Maruti800()
	{
		System.out.println("Maruti 800 class");
		
		
	}
	public void speed()
	{
		System.out.println("Max speed:80kmph");
	}
	
}

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		
		Maruti800 obj=new Maruti800();
		obj.brand();

		obj.speed();
		obj.vehicleType();
	}
}