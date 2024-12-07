package multithreading;

/*
 * final var--->Stop Changing Value
 * final method--->Stop Overriding
 * Final Class--->Stop Inheritance*/
final  class A
{
 final int a=10;	
final void run()
{
	//a=56;we cant change value because a is Final VR
}
//}
//public class FinalEx extends A//--->we cant inherit final Class
//{
	//a=56;we cant change value because a is Final VR

	
	/*final void run()
{
		//a=56;we cant change value because a is Final VR
	}  // we can overrride  final method*/
	public static void main(String[] args) {
		//A obj=new A();
		////obj.a=20;//;we cant change value because a is Final VR

	}

}
