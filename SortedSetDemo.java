package dsa;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.*;

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> set=new TreeSet<>();
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
	}
}
