import java.util.Scanner;
import java.awt.*; //* denotes that all classes under AWT are imported 

public class AWTexp extends Frame
{
  AWTexp()
  {
	  Button b= new Button("click me");
	  b.setBounds(10,100,80,30);;
	  add(b);
	  setSize(300,300);
	  setLayout(null);
	  setVisible(true);
	 
  }
  
  public static void main(String args[])
  {
	  AWTexp f=new AWTexp();
  }
}
