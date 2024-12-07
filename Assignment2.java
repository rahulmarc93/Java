package lab_4;

class Animals{
	public void makeSound() {
	    System.out.println("The animal makes a sound.");
	}
	}
class Dogs extends Animals {
	
	public void makeSound() {
	    System.out.println("The dog barks.");
	}
	}


class Cats extends Animals {

public void makeSound() {
    System.out.println("The cat meows.");
}
}


public class Assignment2 {

	public static void main(String[] args) {
		Animals A = new Animals();
	    Dogs D = new Dogs();
	    Cats C = new Cats();
	    
	   
	    System.out.println("Animal Sound:");
	    A.makeSound();
	    
	    System.out.println("Dog Sound:");
	    D.makeSound();
	    
	    System.out.println("Cat Sound:");
	    C.makeSound();

	}

}