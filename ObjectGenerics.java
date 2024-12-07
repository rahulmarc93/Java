package dsa;

import java.util.*;


class Student
{
	int id;
	int age;
	String name;
	Student(int id,int age,String name)
	{
		this.id=id;
		this.age=age;
		this.name=name;
	}
}
public class ObjectGenerics {
public static void main(String[] args) {
List<Student>inf=new Stack<>();
Student s1=new Student(101,21,"Tofiq");
Student s2=new Student(101,21,"Prachi");
Student s3=new Student(101,21,"Vruchika");
inf.add(s1);
inf.add(s2);
inf.add(s3);
//traverse List
for(Student s:inf)
System.out.println(s.id+" "+s.name+" "+s.age);
}


}


