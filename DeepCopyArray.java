package array;

public class DeepCopyArray {

		public static void main(String[] args) {
			// Deep Copy
			int num[]= {11,22,33,44};
			int numcopy[]=num.clone();
			System.out.println(num);
			System.out.println(numcopy);
			System.out.println(num[1]);
			System.out.println(numcopy[1]);
			System.out.println(num==numcopy);
			for(int i=0;i<4;i++)
			{
				System.out.print(num[i]+" ");
				
			}
			for(int i=0;i<4;i++)
			{
				System.out.print(numcopy[i]+" ");
				
			}
			

		}

	}