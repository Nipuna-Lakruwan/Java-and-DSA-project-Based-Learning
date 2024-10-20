
import javax.swing.JOptionPane; // Import the JOptionPane class
// JOptionPane is a class in javax.swing package that provides a set of static methods to create pop-up dialog boxes for input and output

public class Main {
  public static void main(String[] args) {
    
    String name = JOptionPane.showInputDialog("Enter your name: "); // Read user input
    JOptionPane.showMessageDialog(null, "Hello " + name + "!"); // Display a message

    String age = JOptionPane.showInputDialog("Hello " + name + "!, How old are you? "); // Read user input
    JOptionPane.showMessageDialog(null,name + " You are " + age + " years old."); // Display a message

    // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age: ")); // Integer.parseInt() converts the string to an integer

    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: ")); // Double.parseDouble() converts the string to a double
    JOptionPane.showMessageDialog(null, "Your height is " + height + " cm tall."); // Display a message

  }
}
