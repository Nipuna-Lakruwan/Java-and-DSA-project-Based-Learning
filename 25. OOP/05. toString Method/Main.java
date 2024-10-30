public class Main {
  public static void main(String[] args) {
    
    // toString() method = special method that all objects inherit, that returns a string that "textually represents" an object
    //                    can be used both implicitly and explicitly
    
    Car car = new Car();

    // System.out.println(car.make);
    // System.out.println(car.model);
    // System.out.println(car.color);
    // System.out.println(car.year);


    System.out.println(car); // toString() method is called here
    System.out.println(car.toString()); // toString() method is called here

    

  }
}
