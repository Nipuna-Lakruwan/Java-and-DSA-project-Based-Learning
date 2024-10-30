import javax.swing.ImageIcon;
import java.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame(){
      
    this.setTitle("JFrame Title Goes Here");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setVisible(true);
    this.setSize(420, 420);

    ImageIcon icon = new ImageIcon("monkey-funny-face-vector-logo.avif");
    this.setIconImage(icon.getImage());

    this.getContentPane().setBackground(new Color(123, 50, 250));
  }
  }
