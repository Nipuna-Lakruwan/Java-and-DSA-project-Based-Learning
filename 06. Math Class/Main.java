
import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    
    // double x = 3.14;
    // double y = -10;

    // double z = Math.max(x, y); // returns the highest value

    // double a = Math.min(x, y); // returns the lowest value

    // double b = Math.abs(y); // returns the absolute value of y (positive) 

    // double c = Math.sqrt(x); // returns the square root of x

    // double d = Math.round(x); // returns the value of x rounded to the nearest whole number

    // double e = Math.floor(x); // returns the value of x rounded down to the nearest whole number

    // System.out.println(e);

    // Quiz: Create a program that calculates the hypotenuse of a right triangle ( Get the values of the base and height from the user)

    double x;
    double y;
    double z;

    Scanner scanner = new Scanner(System.in); // Create a Scanner object

    System.out.print("Enter the base of the triangle: "); // Print a message
    x = scanner.nextDouble(); // Read user input

    System.out.print("Enter the height of the triangle: "); // Print a message (If you use println() here, it will print the message in a new line)
    y = scanner.nextDouble(); // Read user input

    z = Math.sqrt((x * x) + (y * y)); // Calculate the hypotenuse of the triangle

    System.out.println("The hypotenuse of the triangle is: " + z); // Print the hypotenuse of the triangle

    scanner.close(); // Close the scanner object to prevent memory leak 
  }
  
}
