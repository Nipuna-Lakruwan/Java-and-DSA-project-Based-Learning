public class Car extends Vehicle {
  
  @Override
  void go() {
    System.out.println("The car is moving");
  }
  
  @Override
  void stop() {
    System.out.println("The car has stopped");
  }
  
  @Override
  void method() {
    System.out.println("This is a method");
  }
}
