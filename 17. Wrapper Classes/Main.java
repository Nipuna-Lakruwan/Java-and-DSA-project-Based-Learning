public class Main {
  public static void main(String[] args) {
    
    // Wrapper Classes = provides a way to use primitive data types as reference data types
    //                   reference data types contain useful methods (ex. String Methods)
    //                   can be used with collections (ex.ArrayList)

    // Primitive        // Wrapper
    // ---------        // --------
    // boolean          // Boolean
    // char             // Character
    // int              // Integer
    // double           // Double

    // Autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes 
    // Unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive type

    Boolean a = true; // Wrapper class for primitive data type boolean
    Character b = '@'; // Wrapper class for primitive data type char
    Integer c = 123; // Wrapper class for primitive data type int 
    Double d = 3.14; // Wrapper class for primitive data type double 
    String e = "Nipuna"; // Not a wrapper class, but useful for autoboxing and unboxing 

    if(b == '@') {
      System.out.println("It is true");
    }
  }
}
