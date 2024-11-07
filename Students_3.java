package constructorTypes;

public class Students_3 {
	int id;
	String name;
	int age;
	//creating parameterised Constructor

	Students_3(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}

	void display()
	{
		System.out.println("Id:"+id+" "+"Name:"+name+"Age:"+age);
	}

	public static void main(String[] args) {
		//creating object and passing value
		Students_3 s1=new Students_3(101,"Ashish",20);
		Students_3 s2=new Students_3(102,"Pratiksha",20);
		Students_3 s3=new Students_3(103,"Tejshri",20);
		s1.display();
		s2.display();
		s3.display();
	}
}
