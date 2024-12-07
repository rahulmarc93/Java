package oop;
/*
 * Multiple Inheritance is not supported in java but we can acheive through interface
 */
interface HumanWalk
{
	void walk();
	
}
interface HumanEat
{
	void eat();
	
}

public class MultipleInheritanceDemo implements HumanWalk,HumanEat{
	@Override
	public void eat() {
		System.out.println("Human can eat veg and Non veg");
		
	}

	@Override
	public void walk() {
		System.out.println("Human can walk");
		
	}

	public static void main(String[] args) {
	//HumanEat obj=new HumanEat();not possible to create an object of interface
	MultipleInheritanceDemo obj=new MultipleInheritanceDemo();
	obj.eat();
	obj.walk();
	

}}
