public class Main {
  public static void main(String[] args) {
    
    // Inheritance = the process where one class acquires the properties (methods and fields) of another class.

    Car car = new Car();

    car.go();

    Bicycle bicycle = new Bicycle();

    bicycle.stop();

    System.out.println(car.speed);
    System.out.println(bicycle.speed);

    System.out.println(car.wheels);
    System.out.println(bicycle.wheels);

    System.out.println(car.doors);
    // System.out.println(bicycle.doors); // Error
    System.out.println(bicycle.pedals);
  }
}
