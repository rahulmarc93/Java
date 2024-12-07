package lab_7;

import java.util.*;

class HashSet_Lab_7 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> a = new HashSet<>();

        // Adding elements
        a.add("Rahul");
        a.add("Tom");
        a.add("and");
        a.add("Jerry");

        // Adding new element to the HashSet
        a.add("Oggy and the cockroaches");

        // Display or print the HashSet
        System.out.println("HashSet after appending an element: " + a);
    }
}
