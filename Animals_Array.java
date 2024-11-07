package array;

public class Animals_Array {

	public static void main(String[] args) {
			// Static way
		String animals[]= {"Lion","Tiger","Cheetah","Dinosaur","Snake","Panther","Zebra","Horse","Rhino","Elephant"};
		System.out.println(animals[1]);
		System.out.println(animals);
			
		for(int  i=0;i<animals.length;i++)
		{
			System.out.println(animals[i]);
		}

	    int num[] = new int[5];  
	    num[0] = 10;
	    num[1] = 20;
	    num[2] = 30;
	    num[3] = 40;
	    num[4] = 50;

	    System.out.println("Array elements are: ");
	    for (int i = 0; i < 5; i++) {
	        System.out.println(num[i]);
	    }
	    
	    int largest = num[0];  // Initialize the largest variable with the first element

	    for (int i = 1; i < num.length; i++) {
	        if (num[i] > largest) {
	            largest = num[i];  // Update largest if current element is larger
	        }
	    }

	    System.out.println("The largest number is: " + largest);
	}
}
