public class Main {
  public static void main(String[] args) {
    String x = "Water";
    String y = "Milk";
    String temp;

    System.out.println("Before swapping:");
    System.out.println("x = " + x);
    System.out.println("y = " + y);

    // Swap x and y
    temp = x;
    x = y;
    y = temp;

    System.out.println("After swapping:");
    System.out.println("x = " + x);
    System.out.println("y = " + y);
  }
  
}
