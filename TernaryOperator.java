package Operators;
import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		//Taking user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter your mark");
		double mark=sc.nextDouble();
		//ternary operation
		String result=(mark>=50)?"pass":"Fail";
		
		System.out.println("You"+" "+result+" In the Exam");
		sc.close();
	}
}