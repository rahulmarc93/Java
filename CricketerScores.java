package lab_8;

import java.util.HashMap; //or we can use import java.util.*;
import java.util.Scanner;

public class CricketerScores {
    public static void main(String[] args) {
        // Create a Map to store cricketer names and their scores
        HashMap<String, Integer> cricketers = new HashMap<>();
        
        // Adding data to the Map
        cricketers.put("Virat Kohli", 12000);
        cricketers.put("Rohit Sharma", 9000);
        cricketers.put("MS Dhoni", 10500);
        cricketers.put("Sachin Tendulkar", 18426);
        
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the cricketer:");
        String name = scanner.nextLine();
        
        // Search for the cricketer's score
        if (cricketers.containsKey(name)) {
            System.out.println(name + " scored " + cricketers.get(name) + " runs.");
        } else {
            System.out.println("Cricketer not found.");
        }
        scanner.close();
    }
}
