public class Main {
  public static void main(String[] args) {
    
    // String = a reference data type that can store one or more characters
    //          reference data types have access to useful methods

    String name = "Nipuna";

    //boolean result = name.equals("Nipuna"); // true (case sensitive)
    //boolean result2 = name.equalsIgnoreCase("nipuna"); // true (case insensitive)

    //int result = name.length(); // 6

    //char result2 = name.charAt(0); // N

    //int result = name.indexOf("p");

    //boolean result2 = name.isEmpty(); // false

    //String result = name.toUpperCase(); // NIPUNA

    //String result = name.toLowerCase(); // nipuna

    //String result = name.trim(); // removes white spaces

    String result = name.replace('N', 'P'); // Pipuna

    System.out.println(result);
    //System.out.println(result2);


  }
}
