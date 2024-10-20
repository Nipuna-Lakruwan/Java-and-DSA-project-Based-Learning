public class Main {
  public static void main(String[] args) {
    
    // Expressions = operands & operators
    // Operands = values, variables, numbers, quantity
    // Operators = + - * / %

    int friends = 10;

    friends = friends + 1; // friends = 11
    friends++; // friends = 12

    friends = friends - 1; // friends = 10
    friends--; // friends = 9

    friends = friends * 2; // friends = 20

    double friends1;
    friends1 = (double) friends / 3; // friends = 6.666666666666667

    friends = friends % 3; // friends = 1

    System.out.println(friends);
  }
}
