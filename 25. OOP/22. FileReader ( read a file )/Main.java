
import java.io.FileReader;

public class Main {
  public static void main(String[] args) {
    

    // FileReader = read the contents of a file as a stream of characters. One by one
    //              read() returns int value which contains the byte value
    //              when read() returns -1, there is no more data to be read


    try {
      FileReader reader = new FileReader("art.txt");
      int data = reader.read();
      while (data != -1) {
        System.out.print((char)data);
        data = reader.read();
          
      }
      reader.close();


    }
    catch (Exception e) {
      System.out.println("An error occurred.");
    }
    
  }
}
