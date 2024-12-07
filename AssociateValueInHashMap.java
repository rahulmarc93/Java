package lab_8;

import java.util.HashMap;

public class AssociateValueInHashMap {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();
        
        // Associate specified value with specified key
        map.put(1, "Rahul");
        map.put(2, "Kumar");
        map.put(3, "Saha");
        
        // Display the HashMap
        System.out.println("HashMap: " + map);
    }
}