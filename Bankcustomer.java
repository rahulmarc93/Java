package interviewCodes;

class Bankcustomer {
    private int acno;         // Account number
    private String atype;     // Account type (e.g., savings, current)
    private double amt;       // Amount in account

    // Parameterized constructor
    Bankcustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Method to display customer details
    public void display() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Amount: " + amt);
    }

    // Main method
    public static void main(String[] args) {
        Bankcustomer customer1 = new Bankcustomer(12345, "Savings", 5000.0);
        customer1.display();
    }
}
