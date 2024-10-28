
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    
    // For-each loop = traversing technique to iterate through the elements in an array/collection
    //                  less steps, more readable
    //                  less flexible

    //String[] animals = {"cat", "dog", "rat", "bird"};

    ArrayList<String> animals = new ArrayList<String>();

    animals.add("cat");
    animals.add("dog");
    animals.add("rat");
    animals.add("bird");
    

    for (String i : animals) {
      System.out.println(i);
        
    }
  }
}
