public class Person {
  

  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return "Name: " + this.name + "\nAge: " + this.age;
  }
}
