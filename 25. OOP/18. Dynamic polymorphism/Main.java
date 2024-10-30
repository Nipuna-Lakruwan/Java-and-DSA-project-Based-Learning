
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    // polymorphism = many shapes/forms
    // dynamic = after compilation (during runtime)

    // example: A corvette is a: corvette, and a car, and a vehicle, and an object

    //Animal animal = new Dog();

    Scanner scanner = new Scanner(System.in);
    Animal animal;

    System.out.println("Enter animal type: ");
    System.out.println("(1 = Dog) or (2 = Cat)");
    int choice = scanner.nextInt();

    if (choice == 1) {
      animal = new Dog();
      animal.speak();
    } else if (choice == 2) {
      animal = new Cat();
      animal.speak();
    } else {
      animal = new Animal();
      animal.speak();
      System.out.println("Invalid choice");
    }
  }
}
