
import java.util.Random; // Import the Random class from the java.util package
// The Random class is used to generate random numbers of different data types, such as int, long, double, and float
// But there is a disclaimer that says: "This class provides pseudorandom number generation, which is a fancy way of saying it generates random numbers."



public class Main {
  public static void main(String[] args) {
    
    Random random = new Random(); // Create a Random object

    //int x = random.nextInt(6); // Generate a random number between 0 and 5 because the computer starts counting from 0
    int x = random.nextInt(6) + 1; // Generate a random number between 1 and 6

    double y = random.nextDouble(); // Generate a random number between 0.0 and 1.0

    boolean z = random.nextBoolean(); // Generate a random boolean value

    System.out.println(z); // Print the random number
  }
}
