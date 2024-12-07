package streamAPIDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * used to process Collection of Objects
 * it support various method to produce desired output
 * 1.Map--->used to return Stream of consisting of the result applying in given function
 * 2.Filter--->used to select elements as per demand
 * 3.Sorted-->used to order the stream
 * 4.collect--->used to return result that performed on the stream
 * 5.foreach-->used to iterate data from stream
 */

public class StreamAPIDemo {

	public static void main(String[] args) {
		//creating List of Integers
		List<Integer> num=Arrays.asList(2,3,4,5,6);
		//Demonstrating Map method
		List<Integer> square=num.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
		//FilterMethod
		List<String> name=Arrays.asList("Sakshi","Priti","Prachi","Sapna","Pranjali","Pratiksha","Rohit");
		List<String> filtername=name.stream().filter(s->s.startsWith("P")).collect(Collectors.toList());
		System.out.println(filtername);
		//Sorted
		List<String> sortedName=name.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedName);
		
		//ForEach Method
		num.stream().map(x->x+10).forEach(y->System.out.println(y));
	}

}
