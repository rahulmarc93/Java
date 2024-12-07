package oop;

class Electronics {
		public Electronics()
		{
			System.out.println("This is a Parent class Electronics");
		}
		public void deviceType()
		{
			System.out.println(" Device type:Electronics");
		}
		public void price()
		{
			System.out.println(" Device price:");
		}
		
	}
	class Mixer extends Electronics
	{
		public Mixer()
		{
	System.out.println("Mixer");
		}
		public void category()
		{
			System.out.println(" Category:Mixer");
		}
		public void price()
		{
			System.out.println(" Device price:5000");
		}
	}

	public class SingleInheritance {

		public static void main(String[] args) {
			
			Mixer obj=new Mixer();
			obj.deviceType();
			obj.category();
			obj.price();
		}
	}