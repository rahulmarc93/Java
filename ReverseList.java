package oop;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        strings.add("Ruby");

        // Display original list
        System.out.println("Original List: " + strings);

        // Reverse the list
        Collections.reverse(strings);

        // Display reversed list
        System.out.println("Reversed List: " + strings);
    }
}
