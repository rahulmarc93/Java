package interviewCodes;

import java.util.Scanner;
class Calculator
{
	int num1,num2;
	Calculator()
	{
		
	}
	Calculator(int a,int b)
	{
		num1=a;
		num2=b;
	}
	
}

public class SwitchDemo {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		
		System.out.println("Enter the second number");
		b=sc.nextInt();
		Calculator obj=new Calculator(a,b);
		System.out.println("Enter the choice[+,-,*,/,%]");
		String ch;
		ch=sc.next();
		char array[]=ch.toCharArray();
		switch(array[0])
		{
		case '+':System.out.println("Addition is:"+(obj.num1+obj.num2));
		break;
		case '-':System.out.println("Substraction is:"+(obj.num1-obj.num2));
		break;
		case '*':System.out.println("Multiplication is:"+(obj.num1*obj.num2));
		break;
		case '/':System.out.println("Division is:"+(obj.num1/obj.num2));
		break;
		case '%':System.out.println("Modulus is:"+(obj.num1%obj.num2));
		break;
		
		default:System.out.println("OOPS!!!!!Please enter Correct option");
		break;
		
		
		}
		sc.close();
	}
}
