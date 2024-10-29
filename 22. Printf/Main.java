public class Main {
  public static void main(String[] args) {
    
    // printf() = an optional method to control, format, and display text to the console window 
    //            two arguments = format string + (object/variable/value)
    //            % [flags] [precision] [width] [conversion-character]

    //System.out.printf("This is a format string %d", 123);

    boolean myBoolean = true;
    char myChar = '@';
    String myString = "Nipuna";
    int myInt = 50;
    double myDouble = 1000;

    // [conversion-character] = d, f, s, etc.
    //System.out.printf("%b", myBoolean); // %b converts boolean into string
    //System.out.printf("%c", myChar); // %c converts char into string
    //System.out.printf("%s", myString); // %s converts string into string
    //System.out.printf("%d", myInt); // %d converts integer into string
    //System.out.printf("%f", myDouble); // %f converts floating point number into string

    // [width]
    // minimum number of characters to be written as output
    //System.out.printf("%10d", myInt); // %10d : 10 characters wide
    //System.out.printf("Hello %10s", myString); // %10s : 10 characters wide

    // [precision]
    // sets number of digits of precision when outputting floating-point values
    //System.out.printf("You have this much money %.2f", myDouble); // %.2f : 2 decimal points

    // [flags]
    // adds an effect to output based on the flag added to format specifier
    // - : left-justify
    // + : output a plus ( + ) or minus ( - ) sign for a numeric value
    // 0 : numeric values are zero-padded
    // , : comma grouping separator if numbers > 1000

    System.out.printf("You have this much money %,f", myDouble); // %,f : comma separator for numbers > 1000 

  }
}
