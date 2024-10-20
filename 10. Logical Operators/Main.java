
import java.util.Scanner;



public class Main {
  public static void main(String[] args) {
    
    // Logical Operators = used to connect two or more expressions
    //      && = (AND) both conditions must be true
    //      || = (OR) either condition must be true
    //      ! = (NOT) reverses boolean value of a condition

    
    // && = (AND) both conditions must be true
    int temp = 25;

    if (temp > 30) {
      System.out.println("It is hot outside");
    } else if (temp >= 20 && temp <= 30) {
      System.out.println("It is warm outside");
    } else {
      System.out.println("It is cold outside");
    }

    // || = (OR) either condition must be true

    Scanner scanner = new Scanner(System.in);

    System.out.println("You are playing a game! Press q or Q to quit");
    String response = scanner.next();

    if (response.equals("q") || response.equals("Q")) {
      System.out.println("You quit the game");
    } else {
      System.out.println("You are still playing the game *pew pew*");
    }


    // ! = (NOT) reverses boolean value of a condition

    Scanner scanner = new Scanner(System.in);

    System.out.println("You are playing a game! Press q or Q to quit");
    String response = scanner.next();

    if (!response.equals("q") && !response.equals("Q")) {
      System.out.println("You are still playing the game *pew pew*");
    } else {
      System.out.println("You quit the game");
    }

    scanner.close();
  }

}
