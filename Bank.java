package interviewCodes;
class Bank {
    // Instance variable
    private double amount;

    // Parameterized constructor to initialize the amount
    public Bank(double amount) {
        this.amount = amount;
    }
    // Method to withdraw amount
    public void withdraw(double withdrawalAmount) {
        // Check if amount is sufficient using ternary operator
        String message = (amount >= withdrawalAmount) ? "Withdraw successful" : "Insufficient balance";
        System.out.println(message);

        // Update amount if sufficient balance
        amount = (amount >= withdrawalAmount) ? amount - withdrawalAmount : amount;
    }

    // Method to deposit amount
    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Total Balance: " + amount);
    }

    public static void main(String[] args) {
        // Initialize Bank object with initial amount 10000
        Bank bankAccount = new Bank(10000);

        // Perform withdrawal
        bankAccount.withdraw(3000);

        // Deposit 5000
        bankAccount.deposit(5000);

        // Display final balance
        bankAccount.displayBalance();
    }
}
