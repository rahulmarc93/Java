package lab_8;

import java.util.HashMap;

public class CheckHashMapEmpty {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();
        
        // Check if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }
        
        // Adding some elements
        map.put(1, "Video");
        map.put(2, "Call");
        
        // Check again
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }
    }
}
