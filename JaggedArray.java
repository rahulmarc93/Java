package array;

public class JaggedArray {

	public static void main(String[] args) {
				// jagged array declaration using dynamic way
				int arr[][]=new int[4][];
				arr[0]=new int[3];
				arr[1]=new int[5];
				arr[2]=new int[6];
				arr[3]=new int[4];
				int count=10;
				//print the elements
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr[i].length;j++)
					{
						arr[i][j]=count++;
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
	}
}