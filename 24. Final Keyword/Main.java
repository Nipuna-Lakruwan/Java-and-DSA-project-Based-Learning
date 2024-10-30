public class Main {
  public static void main(String[] args) {
    
    // final keyword
    // - final keyword can be applied to class, method, and variable
    // - final keyword = restricts the user
    // - final class = class cannot be inherited
    // - final method = method cannot be overridden
    // - final variable = variable becomes a constant, cannot be changed

    final double pi = 3.14159;

    //pi = 4; // error: cannot assign a value to final variable pi (final variable cannot be changed) 

    System.out.println(pi);
  }
}
