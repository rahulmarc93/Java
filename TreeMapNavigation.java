package lab_9;

import java.util.*;

public class TreeMapNavigation {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);

        System.out.println("Original TreeMap: " + treeMap);

        // Remove an entry
        Integer removedValue = treeMap.remove("Two");
        System.out.println("Removed value: " + removedValue);
        System.out.println("Updated TreeMap: " + treeMap);

        // Navigate the TreeMap
        System.out.println("Navigating the TreeMap:");
        treeMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
