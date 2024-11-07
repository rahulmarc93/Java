package Operators;
/*
 * XOR
 * x=0,y=0 x^Y=0
 * x=0,y=1 x^Y=1
 * x=1,y=0 x^Y=1
 * x=1,y=1 x^Y=0
 * 
 * AND
 * x=0,y=0 x&Y=0
 * x=0,y=1 x&Y=0
 * x=1,y=0 X&Y=0
 * x=1,y=1 x&Y=1
 * 
 * OR
 * x=0,y=0 x&Y=0
 * x=0,y=1 x&Y=1
 * x=1,y=0 &&Y=1
 * x=1,y=1 x&Y=1
 * 
 */
	public class BitwiseOperator {
		public static void main(String[]args) {
			int x=12;
			int y=25;
			//00001100^00011001= 00010101=21
			System.out.println("x^y:"+(x^y));
			System.out.println("x&y:"+(x&y));
			System.out.println("x|y:"+(x|y));
		}
	}