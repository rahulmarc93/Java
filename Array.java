package array;

public class Array {

	public static void main(String[] args) {
			// Static way
			String fruits[]= {"Apple","Banana","Kiwi","Mango"};
			System.out.println(fruits[1]);
			System.out.println(fruits);
			
			for(int  i=0;i<fruits.length;i++)
			{
				System.out.println(fruits[i]);
			}
			//iterate using for each loop
			for(String a:fruits)

			{
				System.out.println(a);
			}

			//using new Keyword
			int num[]=new int[5];
			num[0]=10;
			num[1]=20;
			num[2]=30;
			num[3]=40;
			num[4]=50;
			
			for(int  i=0;i<5;i++)
			{
				System.out.println(num[i]);
			}
			}

		}