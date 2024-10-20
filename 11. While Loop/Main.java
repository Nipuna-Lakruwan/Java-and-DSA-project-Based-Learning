
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    // While Loop = executes a block of code as long as a it's condition remains true
    //      while (condition) { }
    
    Scanner scanner = new Scanner(System.in);
    String name = "";

    // while (name.isBlank()) {
    //   System.out.print("Enter your name: ");
    //   name = scanner.nextLine();
    // }

    // Do While Loop = executes a block of code at least once, then repeats while it's condition remains true 
    do {
      System.out.print("Enter your name: ");
      name = scanner.nextLine();
    } while (name.isBlank());

    System.out.println("Hello " + name);
  }
  
}
