public class Return {
  public static void main(String[] args) {
    
    // Return = keyword used to give a value back after calling a method 

    int x = 3;
    int y = 4;

    int z = add(x, y);
    System.out.println(z);
  }

  static int add(int x, int y) {
    int a = x + y;
    return a;
  }
}
