public class Main {
  public static void main(String[] args) {
    
    // Constructor = special method that is called when an object is instantiated (created) in Java 

    Human human = new Human("Nipuna", 25, 5.8, 70.0);
    Human human2 = new Human("John", 30, 6.0, 80.0);

    System.out.println(human.name);
    System.out.println(human2.name);

    human2.eat();
    human.drink();
  }
}
