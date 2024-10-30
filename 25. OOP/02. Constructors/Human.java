public class Human {

  String name;
  int age;
  double height;
  double weight;

    Human(String name, int age, double height, double weight) {
      System.out.println("Human created");
      
      this.name = name;
      this.age = age;
      this.height = height;
      this.weight = weight;

    }

    void eat() {
      System.out.println(this.name + " is eating");
    }

    void drink() {
      System.out.println(this.name + " is drinking");
    }
  
  
}
