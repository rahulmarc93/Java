package string;

public class Task1 {

	public static void main(String[] args) {
		// create a String and perform split operation and change String to character array
		String str = "Welcome to Java";

        // Splitting the string by spaces
        String[] splitString = str.split(" ");

        System.out.println("Split string:");
        for (String word : splitString) {
            System.out.println(word);
        }

        // Converting the string to a character array
        char[] charArray = str.toCharArray();

        System.out.println("\nCharacter array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}