package lab_7;

import java.util.*;

public class Add_Remove {

	public static void main(String[] args) 
	{
			// Declare a Stack
	        Stack<Integer> stack = new Stack<>();

	        // Adding 10 elements to the Stack
	        for (int i = 1; i <= 10; i++) {
	            stack.push(i);
	        }

	        System.out.println("Stack after adding 10 elements : " + stack);

	        // Removing 4 elements from the Stack
	        for (int i = 0; i <= 3; i++) {
	            int removedElement = stack.pop();
	            System.out.println("Removed element dishoom " + removedElement);
	        }

	        // Display or printing the Stack after removing the 4 elements
	        System.out.println("Stack after removing 4 elements : " + stack);
	    	}
	}
