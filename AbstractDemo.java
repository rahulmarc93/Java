package oop;
//abstract class
abstract class Animals
{
	//abstract method
	abstract void eat();
	//normal method
	void sound()
	{
		System.out.println("animal will Make a sound");
	}
}
class Tiger extends Animals
{

	@Override
	void eat() {
		
		System.out.println("Tiger will eat Flesh of animal");
	}
	
}
class Mammal extends Animals
{

	@Override
	void eat() {
		
		System.out.println("Elephant will eat Suganecane");
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		//Animal a=new Animal();we cannot create an object of abstract class
		Tiger t = new Tiger();
		t.eat();
		t.sound();
		 Mammal e = new  Mammal();
		 e.eat();
		 e.sound();
	}

}
