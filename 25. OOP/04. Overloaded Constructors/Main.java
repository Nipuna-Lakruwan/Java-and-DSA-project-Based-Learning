public class Main {
  public static void main(String[] args) {
    
    // overloaded constructors = multiple constructors within a class with the same name, but different parameters 
    //                          (i.e., data type, number of parameters, or order of parameters)

    Pizza pizza =  new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");
    Pizza pizza2 = new Pizza("thin crust", "tomato", "mozzerella");
    Pizza pizza3 = new Pizza("thicc crust", "tomato");

    System.out.println("Here are the ingredients of your pizza: ");
    System.out.println(pizza.bread);
    System.out.println(pizza.sauce);
    System.out.println(pizza.cheese);
    System.out.println(pizza.toppings);

    System.out.println("Here are the ingredients of your pizza: ");
    System.out.println(pizza2.bread);
    System.out.println(pizza2.sauce);
    System.out.println(pizza2.cheese);

    System.out.println("Here are the ingredients of your pizza: ");
    System.out.println(pizza3.bread);
    System.out.println(pizza3.sauce);
    

  }
}
