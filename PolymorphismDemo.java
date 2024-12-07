package oop;

class Polygon
{
	//method to render a shape of polygon
	public void render()
	{
		System.out.println("Rendering Polygon...");
	}
}
class Hexagon extends Polygon
{
	public void render()
	{
		System.out.println("Rendering Hexagon...");
	}
}
class Pentagon  extends Polygon
{
	public void render()
	{
		System.out.println("Rendering Pentagon...");
	}
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		Hexagon  obj=new Hexagon ();
		obj.render();

	}

}