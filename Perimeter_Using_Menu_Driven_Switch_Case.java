package interviewCodes;

import java.util.Scanner;

public class Perimeter_Using_Menu_Driven_Switch_Case {

		 public static double perimeterSquare(double side) {
		        return 4 * side;
		    }

		   
		    public static double perimeterRectangle(double length, double width) {
		        return 2 * (length + width);
		    }

		   
		    public static double perimeterCircle(double radius) {
		        return 2 * Math.PI * radius;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int choice;
		        
		        do {
		            System.out.println("\n--- Perimeter Calculator ---");
		            System.out.println("1. Calculate perimeter of a square");
		            System.out.println("2. Calculate perimeter of a rectangle");
		            System.out.println("3. Calculate perimeter of a circle");
		            System.out.println("4. Exit");
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();
		            
		            switch (choice) {
		                case 1:
		                    
		                    System.out.print("Enter the side square: ");
		                    double side = scanner.nextDouble();
		                    System.out.println("Perimeter of the square: " + perimeterSquare(side));
		                    break;

		                case 2:
		                  
		                    System.out.print("Enter the length of the rectangle: ");
		                    double length = scanner.nextDouble();
		                    System.out.print("Enter the width of the rectangle: ");
		                    double width = scanner.nextDouble();
		                    System.out.println("Perimeter of the rectangle: " + perimeterRectangle(length, width));
		                    break;

		                case 3:
		                    
		                    System.out.print("Enter the radius of the circle: ");
		                    double radius = scanner.nextDouble();
		                    System.out.println("Perimeter  of the circle: " + perimeterCircle(radius));
		                    break;

		                case 4:
		                    
		                    System.out.println("Exit");
		                    break;

		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        } while (choice!=4);
		    }
}