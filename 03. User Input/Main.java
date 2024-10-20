

import java.util.Scanner; // Import the Scanner class

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in); // Create a Scanner object

    System.out.print("Enter your name: "); // Print a message
    String name = scanner.nextLine(); // Read user input
    System.out.print("Hello " + name + "!, How old are you? "); // Print the user input
    int age = scanner.nextInt(); // Read user input
    System.out.print(name + ", What is your favorite food? "); // Print a message
    String food = scanner.next(); // Read user input // if you use nextLine() here, it will not wait for the user input

    System.out.println("Hello " + name + "! You are " + age + " years old and your favorite food is " + food + "."); // Print the user input
  }
}
