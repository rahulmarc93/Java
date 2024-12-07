package dsa;

/*
 *LinkedHashMap-->InsertionOrder
 * TreeMap--->AscendingOrder
 * HashMap-->no Order
 */

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> num=new LinkedHashMap<>();
num.put("Key1", 10);
num.put("Key2", 10);
num.put("Key1", 10);
num.put("Key3", 20);
num.put("Key4", 30);
num.put("Key5", 40);
//Display the entrySet
System.out.println("Entries:"+num.entrySet());
//Accessing Values
System.out.println("Values:"+num.values());

//Display keys
System.out.println("Keys:"+num.keySet());
//Remove an elements from Map
int val1=num.remove("Key3");
System.out.println("Removed elements is:"+val1);
System.out.println("Entries:"+num.entrySet());
	}

}
