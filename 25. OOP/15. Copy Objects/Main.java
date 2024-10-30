public class Main {
  public static void main(String[] args) {
    
    // Copy Objects in Java with Constructor Method and Clone Method in Java 
    // - Copying objects in Java can be done using the constructor method or the clone method
    // - The constructor method is the most common way to copy objects in Java
    // - The clone method is another way to copy objects in Java, but it is not commonly used

    // Copy Objects in Java with Constructor Method
    // - The constructor method is the most common way to copy objects in Java
    // - The constructor method is used to create a new object with the same values as an existing object
    
    // Copy Objects in Java with Clone Method
    // - The clone method is another way to copy objects in Java
    // - The clone method is used to create a new object with the same values as an existing object
    // - The clone method is not commonly used in Java

     Car car1 = new Car("Chevrolet", "Camaro", 2020);
     //Car car2 = new Car("Ford", "Mustang", 2021);

     //car1 = car2; // Copy Objects in Java with Constructor Method and Clone Method in Java 

     //car2.copy(car1); // Copy Objects in Java with Constructor Method and Clone Method in Java

    Car car2 = new Car(car1); // Copy Objects in Java with Constructor Method and Clone Method in Java

     System.out.println(car1);
     System.out.println(car2);
     System.out.println();
     System.out.println(car1.getMake());
      System.out.println(car1.getModel());
      System.out.println(car1.getYear());
      System.out.println();
      System.out.println(car2.getMake());
      System.out.println(car2.getModel());
      System.out.println(car2.getYear());

  }
}
