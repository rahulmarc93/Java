package dsa;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> set=new LinkedHashSet<>();
set.add(1);
set.add(1);
set.add(11);
set.add(21);
set.add(31);
set.add(15);
Iterator<Integer> i=set.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
set.remove(31);
System.out.println(set);
Set<Integer> set1=new LinkedHashSet<>();
set1.add(12);
set1.add(41);
set1.add(56);
set1.add(15);
set1.add(1);
System.out.println(set1);
set.addAll(set1);
System.out.println(set);

set.removeAll(set1);
System.out.println(set);
	}
	

}
