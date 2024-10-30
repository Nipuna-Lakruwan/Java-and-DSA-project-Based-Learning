public class Main {
  public static void main(String[] args) {
    
    Car car = new Car();
    Bicycle bicycle = new Bicycle();
    Boat boat = new Boat();

    //Car[] racers = {car, bicycle, boat};

    Vehicle[] racers = {car, bicycle, boat}; // Polymorphism in action here as we can store different objects in the same array of type Vehicle (parent class) and call the same method on all of them without knowing the actual type of the object at runtime (we only know that they are all of type Vehicle) 

    // car.go();
    // bicycle.go();
    // boat.go();


    for (Vehicle x : racers) {
      x.go();
    }
  }
}
