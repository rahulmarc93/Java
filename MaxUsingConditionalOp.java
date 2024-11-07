package interviewCodes;
import java.util.Scanner;
public class MaxUsingConditionalOp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find the maximum using the conditional operator
        int maximum = (num1 > num2) ? num1 : num2;

        // Display the result
        System.out.println("The maximum number is: " + maximum);
        scanner.close();
    }
}