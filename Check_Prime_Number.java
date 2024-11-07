package interviewCodes;

public class Check_Prime_Number {

	public static void main(String[] args) {
				int i,flag=0;
				int a=17;//a is the number that we need to check prime or not
				
				if(a==0||a==1)
				{
					System.out.println(a+" is neither prime nor composit");
					
				}
				else
				{
					for(i=2;i<a;i++)
					{
						if(a%i==0)
						{
							System.out.println(a+" is not prime");
							flag=1;
							break;
						}
					}
					if(flag==0)
					{
						System.out.println(a+" is prime");
					}
				}
	}
}
