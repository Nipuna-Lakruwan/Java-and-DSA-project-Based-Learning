
import java.io.File;


public class Main {
  public static void main(String[] args) {
    
    // File class
    // - used to read, write, and manipulate files
    // - located in the java.io package
    // - File class is used to create an object that represents a file or directory
    // - File class is used to create, delete, and rename files or directories
    // - File class is used to get information about files or directories
    // - File class is used to read from and write to files
    // - File class is used to get the list of files in a directory
    
    // File class methods
    // - createNewFile() - creates a new file
    // - delete() - deletes a file or directory
    // - exists() - checks if a file or directory exists
    // - getName() - returns the name of a file or directory
    // - getParent() - returns the parent directory of a file or directory
    // - getPath() - returns the path of a file or directory
    // - isDirectory() - checks if a file is a directory
    // - isFile() - checks if a file is a regular file
    // - list() - returns an array of files and directories in a directory
    // - mkdir() - creates a directory
    // - renameTo() - renames a file or directory
    // - setReadOnly() - sets a file or directory to read-only
    
    // File class constructors
    // - File(String pathname) - creates a new File instance by converting the given pathname string into an abstract pathname
    // - File(String parent, String child) - creates a new File instance from a parent pathname string and a child pathname string
    // - File(File parent, String child) - creates a new File instance from a parent abstract pathname and a child pathname string
    
    // File class example
    // File myFile = new File("file.txt");
    // myFile.createNewFile();
    // System.out.println(myFile.exists());
    // System.out.println(myFile.getName());
    // System.out.println(myFile.getPath());
    // System.out.println(myFile.isFile());
    // System.out.println(myFile.isDirectory());
    // myFile.delete();
    
    // File class example
    // File myDir = new File("mydir");
    // myDir.mkdir();
    // System.out.println(myDir.exists());
    // System.out.println(myDir.getName());
    // System.out.println(myDir.getPath());
    // System.out.println(myDir.isFile());
    // System.out.println(myDir.isDirectory());
    // myDir.delete();

    // File class example
    // File myFile = new File("file.txt");
    // myFile.createNewFile();
    // System.out.println(myFile.exists());
    // System.out.println(myFile.getName());
    // System.out.println(myFile.getPath());
    // System.out.println(myFile.isFile());
    // System.out.println(myFile.isDirectory());
    // myFile.delete();

    File file= new File("secret_message.txt"); // Create a new file object with the name secret_message.txt 

    // Check if the file exists 
    if (file.exists()) {
      System.out.println("That File exists! :o!");
      System.out.println(file.getPath()); // Print the path of the file 
      System.out.println(file.getAbsolutePath()); // Print the absolute path of the file
      System.out.println(file.isFile()); // Check if the file is a regular file
      file.delete(); // Delete the file
    } else {
      System.out.println("That file doesn't exist! :(");
    }
  }
}
