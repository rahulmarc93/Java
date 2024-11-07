package interviewCodes;

import java.util.Scanner;

public class Perimeter_Using_Menu_Driven_Switch_Case {
	
		    // Method to calculate the perimeter of a square
		    public static double squarePerimeter(double side) {
		        return 4 * side;
		    }

		    // Method to calculate the perimeter of a rectangle
		    public static double rectanglePerimeter(double length, double width) {
		        return 2 * (length + width);
		    }

		    // Method to calculate the perimeter of a circle
		    public static double circlePerimeter(double radius) {
		        return 2 * Math.PI* radius;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int choice;
		        boolean exit = false;

		        while (!exit) {
		            System.out.println("\nChoose an option to calculate the perimeter:");
		            System.out.println("1. Square");
		            System.out.println("2. Rectangle");
		            System.out.println("3. Circle");
		            System.out.println("4. Exit");
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    // Perimeter of a Square
		                    System.out.print("Enter the side length of the square: ");
		                    double side = scanner.nextDouble();
		                    double squarePerimeter = squarePerimeter(side);
		                    System.out.println("Perimeter of the square: " + squarePerimeter);
		                    break;

		                case 2:
		                    // Perimeter of a Rectangle
		                    System.out.print("Enter the length of the rectangle: ");
		                    double length = scanner.nextDouble();
		                    System.out.print("Enter the width of the rectangle: ");
		                    double width = scanner.nextDouble();
		                    double rectanglePerimeter = rectanglePerimeter(length, width);
		                    System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
		                    break;

		                case 3:
		                    // Perimeter of a Circle
		                    System.out.print("Enter the radius of the circle: ");
		                    double radius = scanner.nextDouble();
		                    double circlePerimeter = circlePerimeter(radius);
		                    System.out.println("Perimeter (circumference) of the circle: " + circlePerimeter);
		                    break;

		                case 4:
		                    // Exit
		                    System.out.println("Exiting the program.");
		                    exit = true;
		                    break;

		                default:
		                    System.out.println("Invalid choice. Please select again.");
		                    break;
		            }
		        }
		        scanner.close();
		    }
}