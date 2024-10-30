import java.io.FileWriter;

public class Main {
  public static void main(String[] args) {
    

    try {
        FileWriter writer = new FileWriter("poem.txt");
        writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin everywhere");
        writer.append("\n(A poem by Nipuna)");
        writer.close();
    } 
    catch (Exception e) {
    }
  }
}
