package lab_4;

abstract class Vaccine{
	int age;
    String nationality;

 public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }
 
   
    public void firstDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("First dose taken. Please pay Rs. 250.");
        } else {
            System.out.println("Not eligible for the first dose. Must be Indian and at least 18 years old.");
        }
    }

   
    public void secondDose() {
        System.out.println("Second dose taken.");
    }

    
    public abstract void boosterDose();
}


class VaccinationSuccessful extends Vaccine {

   
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

     
    public void boosterDose() {
        System.out.println("Booster dose taken.");
    }
}


public class Assignment3 {

	public static void main(String[] args) {
		
        VaccinationSuccessful v = new VaccinationSuccessful(17, "Indian");

        
        v.firstDose();
        if (v.age >= 18 && v.nationality.equalsIgnoreCase("Indian")) {
            v.secondDose();

            
            v.boosterDose();
        } else {
            System.out.println("Not eligible for the vaccination sequence.");
        }
	}
}