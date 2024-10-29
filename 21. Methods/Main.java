public class Main {
  public static void main(String[] args) {
    
    // method = a block of code that is executed whenever it is called upon

    // method();
    hello("Nipuna");
    age(22);


  }

  static void hello(String name) {
    System.out.println("Hello " + name);
  }

  static void age(int age) {
    System.out.println("You are " + age + " years old");
  }
}
