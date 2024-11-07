package array;

public class ShallowCopyArray {

	public static void main(String[] args) {
		//shallow copy
		int num[][]= {
				{1,2,3,4},
				{5,6,7,8}
		};
		int clonenum[][]=num.clone();//shallow copy is created
		System.out.println(num[0]);
		System.out.println(clonenum[0]);
		System.out.println(num[1]==clonenum[1]);
	}
}