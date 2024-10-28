
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    
    // ArrayList = a resizable array
    //             Elements can be added and removed after compilation phase
    //             Store reference data types (ex. Integer, String, etc.)

    ArrayList<String> food = new ArrayList<String>();

    food.add("Pizza"); // Index 0
    food.add("Hamburger"); // Index 1
    food.add("Hotdog"); // Index 2

    food.set(0, "Sushi"); // Replace index 0 with "Sushi"

    food.remove(2); // Remove index 2

    food.clear(); // Remove all elements in the ArrayList

    for (int i = 0; i < food.size(); i++) {
      System.out.println(food.get(i));
    }
  }
}
