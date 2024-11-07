package Operators;

public class ShiftOperator {
	public static void main(String[] args) {
		// <<  >>
		//left shift
		int a=8;
		int x=a<<2;//a*2^2=8*4=32
		System.out.println(x);
		
		int y=a<<3;//a*2^3=8*8=64
		System.out.println(y);
		
		//Right Shift
		int z=a>>2;//a/2^2=8/4=2;
		System.out.println(z);
		
		int p=a>>3;//8/2^3=1;
		System.out.println(p);
	}
}