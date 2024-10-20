public class Main {

  public static void main(String[] args) {
    
    // Arrays = used to store multiple values in a single variable
    //          Each value has an index and the index starts from 0
    
    // String[] cars = {"camaro", "corvette", "tesla", "bmw"}; // Array of strings (only one data type)

    // cars[0] = "mustang"; // Change value

    // System.out.println(cars[0]); // Output: mustang

    // Additional way to declare an array
    String[] cars = new String[3]; // Array of strings (only one data type)

    cars[0] = "camaro"; // Index 0
    cars[1] = "corvette"; // Index 1
    cars[2] = "tesla"; // Index 2

    // System.out.println(cars[0]); // Output: camaro
    // System.out.println(cars[1]); // Output: corvette
    // System.out.println(cars[2]); // Output: tesla

    // Loop through an array using a for loop and the array's length property (length method) 
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }
  }
  
}
