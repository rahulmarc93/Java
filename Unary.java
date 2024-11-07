package Operators;

public class Unary {

	public static void main(String[] args) {
				// Unary-->only 1 operant....++,-!,~
				int num = 12;
				int num1 = 12;
				int res1,res2;
					System.out.println(num);//12
						++num; //pre increment
						System.out.println(num);//13
							num++;//post increment number+1
				
				System.out.println(num);//14
				System.out.println(num++);//15
				System.out.println(++num);//16
				System.out.println(--num);//15
				System.out.println(num--);//15

	}

}