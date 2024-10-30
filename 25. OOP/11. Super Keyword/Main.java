public class Main {
  public static void main(String[] args) {
    
    // super = keyword refers to the superclass (parent) of an object
    //         very similar to the "this" keyword
    //         used to access fields, methods, and constructors of a superclass 
    //         super.field
    //         super.method()
    //         super()

    Hero hero1 = new Hero("Batman", 42, "money");
    Hero hero2 = new Hero("Superman", 35, "flight");

    // System.out.println("Name: " + hero1.name);
    // System.out.println("Age: " + hero1.age);
    // System.out.println("Power: " + hero1.power);

    // System.out.println("Name: " + hero2.name);
    // System.out.println("Age: " + hero2.age);
    // System.out.println("Power: " + hero2.power);

    System.out.println(hero1.toString());
    System.out.println(hero2.toString());
  }
}
