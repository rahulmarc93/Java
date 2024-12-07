package oop;

import java.util.ArrayList;

public class SumOfEvens {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        // Calculate the sum of even numbers
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        // Display the result
        System.out.println("Sum of even numbers: " + sum);
    }
}
