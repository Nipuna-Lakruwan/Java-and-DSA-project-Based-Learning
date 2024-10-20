public class Main {
  
  public static void main(String[] args) {
    
    // Switch Statement = statement that allows a variable to be tested for equality against a list of values
    // - more efficient than multiple if statements 
    // - more than 2 branches of a condition 
    
    // - switch (expression) {
    // - case value1:
    // -   // code here
    // -   break;
    // - case value2:
    // -   // code here
    // -   break;
    // - default:
    // -   // code here
    // - }

    String day = "Monday";

    switch(day) {
      case "Sunday": System.out.println("It is Sunday!");
        break;
      case "Monday": System.out.println("It is Monday!");
        break;
      case "Tuesday": System.out.println("It is Tuesday!");
        break;
      case "Wednesday": System.out.println("It is Wednesday!");
        break;
      case "Thursday": System.out.println("It is Thursday!");
        break;
      case "Friday": System.out.println("It is Friday!");
        break;
      case "Saturday": System.out.println("It is Saturday!");
        break;
      default: System.out.println("That is not a day!");
    }

    // Convert the above code to a more concise version using the arrow operator
    switch(day) {
      case "Sunday" -> System.out.println("It is Sunday!");
      case "Monday" -> System.out.println("It is Monday!");
      case "Tuesday" -> System.out.println("It is Tuesday!");
      case "Wednesday" -> System.out.println("It is Wednesday!");
      case "Thursday" -> System.out.println("It is Thursday!");
      case "Friday" -> System.out.println("It is Friday!");
      case "Saturday" -> System.out.println("It is Saturday!");
      default -> System.out.println("That is not a day!");
    }
  


  }
}
