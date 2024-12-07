package oop;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        // Create an array with 5 elements
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Accessing elements of the array:");

        try {
            // Use a loop to access array elements
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch and handle the exception
            System.err.println("Exception caught: Tried to access index outside the array bounds.");
            System.err.println("Exception message: " + e.getMessage());
        }
    }
}
