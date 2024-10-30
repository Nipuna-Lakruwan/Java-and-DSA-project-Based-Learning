package package2;
import package1.*;

public class C {

  
  String defaultMessage = "This is the default message"; // accessible only within the package

  public String publicMessage = "This is the public message"; // accessible from anywhere (within the class, outside the class, within the package, outside the package) 

  protected String protectedMessage = "This is the protected message"; // accessible from within the class, within the package, and within the subclass (outside the package) 

  private String privateMessage = "This is the private message"; // accessible only within the class 
}
