public class Main {
  public static void main(String[] args) {
    
    // Encapsulation = attributes of a class will be hidden or private,
    //                 and can be accessed only through methods (getters & setters)
    //                 you should make attributes private if you don't have a reason to make them public/protected

    Car car = new Car("Chevrolet", "Camaro", 2020);

    // System.out.println(car.getMake());
    // System.out.println(car.getModel());
    // System.out.println(car.getYear());

    //car.year = 2021; // this will not work because year is private in the Car class and can only be accessed through the getYear() method 

    car.setYear(2021);

    System.out.println(car.getMake());
    System.out.println(car.getModel());
    System.out.println(car.getYear());

  }
}
