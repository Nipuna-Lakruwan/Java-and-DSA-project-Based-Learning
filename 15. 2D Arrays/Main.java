public class Main {
  public static void main(String[] args) {
    
    // 2D Arrays = an array of arrays (each element of a 2D array is an array) 
    //             with two dimensions (rows and columns) 

    String[][] cars = new String[3][3]; // 3 rows and 3 columns

    cars[0][0] = "camaro"; // Row 0, Column 0
    cars[0][1] = "corvette"; // Row 0, Column 1
    cars[0][2] = "tesla"; // Row 0, Column 2
    
    cars[1][0] = "mustang"; // Row 1, Column 0
    cars[1][1] = "ford"; // Row 1, Column 1
    cars[1][2] = "chevy"; // Row 1, Column 2

    cars[2][0] = "bmw"; // Row 2, Column 0
    cars[2][1] = "audi"; // Row 2, Column 1
    cars[2][2] = "mercedes"; // Row 2, Column 2

    
    String[][] cars = { // Array of strings (only one data type)
      {"camaro", "corvette", "tesla"},
      {"mustang", "ford", "chevy"},
      {"bmw", "audi", "mercedes"}
    };

    // Loop through an array using a for loop and the array's length property (length method) 
    for (int i = 0; i < cars.length; i++) {
      System.out.println();
      for (int j = 0; j < cars[i].length; j++) {
        System.out.print(cars[i][j] + " ");
      }
    }
  }
}
