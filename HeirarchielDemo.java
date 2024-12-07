package oop;

	class Animal
	{
		String name;
		void display()
		{
			System.out.println("I am an animal");
		}
		void sound()
		{
			
		}
	}
	class Lion extends Animal

	{
		void sound()
		{
			

			System.out.println("GRRRR");
		}
		void getInfo()
		{
			name="lion";
			System.out.println("I am:"+name);
		}
	}
	class Elephant extends Animal
	{
		void sound()
		{
			

			System.out.println("dhfdsfj");
		}
		void getInfo()
		{
			name="Elephant";
			
			System.out.println("I am:"+name);
		}
	}
	class Fox extends Animal

	{
		
		void getInfo()

		{
			name="Fox";
			System.out.println("I am:"+name);
		}
	}
	public class HeirarchielDemo {

		public static void main(String[] args) {
		Lion l=new Lion();
		l.display();
		l.getInfo();
		Fox f=new Fox();
		f.display();
		f.getInfo();
		Elephant e=new Elephant();
		e.display();
		e.getInfo();

		}

	}
