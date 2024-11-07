package array;

public class MDarray {

	public static void main(String[] args) {
		//declaring  MD array using literal way
		int mark[][]= {
				
				{45,43,48},
				{23,45,50},
				{35,38,47},
				{32,12,46}
				
		               };
		//System.out.println(mark[2][0]);
		for(int i=0;i<mark.length;i++)
		{
			for(int j=0;j<mark[i].length;j++)
			{
				System.out.print(mark[i][j]+" ");	
			}
			System.out.println();
		}

	}

}