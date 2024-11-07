package array;

import java.util.Arrays;
import java.util.Collections;

public class CompleteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find the minimum and maximum elements in an array
		//2.Create an array and Reverse the array
		//3.Sort array in Descending order
		
		int a[] = {1, 2, 3, 4, 5};
        int min = a[0], max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println(min);
        System.out.println(max);

        // 2. Reverse the array
        System.out.println("Original array: " + Arrays.toString(a));
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(a));

        // 3. Sort array in descending order
        // Convert int[] to Integer[] to use Collections.reverseOrder()
        Integer[] arrayDescending = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Arrays.sort(arrayDescending, Collections.reverseOrder());
        System.out.println("Array sorted in descending order: " + Arrays.toString(arrayDescending));
	}
}