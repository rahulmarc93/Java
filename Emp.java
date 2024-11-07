package interviewCodes;

class Emp {

	    int eid;          // Employee ID
	    String ename;     // Employee name
	    static String companyName = "Cotech Solutions Pvt. Ltd"; // Static company name

	    // Parameterized constructor
	    Emp(int eid, String ename) {
	        this.eid = eid;
	        this.ename = ename;
	    }

	    // Static method to display the company name
	    public static void displayCompanyName() {
	        System.out.println("Company Name: " + companyName);
	    }

	    // Instance method to display employee details
	    public void displayEmpDetails() {
	        System.out.println("Employee ID: " + eid);
	        System.out.println("Employee Name: " + ename);
	        System.out.println("Company Name: " + companyName); // Accessing static variable
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        Emp emp1 = new Emp(101, "Alice");
	        Emp emp2 = new Emp(102, "Bob");

	        // Displaying individual employee details
	        emp1.displayEmpDetails();
	        System.out.println();  // For better separation in output
	        emp2.displayEmpDetails();

	        // Accessing the static method directly through the class
	        Emp.displayCompanyName();
	    }
	}
