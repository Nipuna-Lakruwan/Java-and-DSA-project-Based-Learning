public class Friend {
  
  String name; // instance variable
  static int numberOfFriends; // static variable

  // constructor method 
  Friend(String name) {
    this.name = name;
    numberOfFriends++;
  } 

  // static method
  static void displayFriends() {
    System.out.println("You have " + numberOfFriends + " friends");
  }
}
