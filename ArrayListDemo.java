package dsa;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> name=new ArrayList<>();
		name.add("Pratiksha");
		name.add("Nilesh");
		name.add("Tejshri");
		name.add("Pranjali");
		name.remove(1);
		System.out.println("Size of an ArrayList;"+name.size());
		
//to trav<erse an element from list using Iterator()
		Iterator<String>itr=name.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//using foreach loop
		for(String str:name)
		{
			System.out.println(str);
		}
	}
}
