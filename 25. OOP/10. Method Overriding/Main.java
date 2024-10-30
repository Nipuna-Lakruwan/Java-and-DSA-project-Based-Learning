public class Main {
  public static void main(String[] args) {
    
    // method overriding = Declaring a method in sub class,
    //                     which is already present in parent class.
    //                     done so that a child class can give its own implementation

    // Why do we need method overriding?
    // - to provide specific implementation to a method that is already provided by its super class
    // - to provide a specific implementation to a method that is a part of an interface

    // Rules of method overriding:
    // 1. The method must have the same name as in the parent class
    // 2. The method must have the same parameter as in the parent class
    // 3. There must be an IS-A relationship (inheritance)

    Animal animal = new Animal();

    animal.speak();

    Dog dog = new Dog();

    dog.speak();
  }
}
