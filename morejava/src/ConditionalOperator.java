import java.util.Scanner;
import javax.swing.*;
import java.lang.*;
import java.io.*;



class ConditionalOperator {
public static void main (String [] args) {

 Scanner var = new Scanner(System.in);
 
 System.out.println("Enter Integer 1 ");
 int x = var.nextInt();
  System.out.println("Enter Integer 2");
  
  int y = var.nextInt();
  
  
  int z=(x>y)?x:y;
 String str = "The larger Number is "+z;
   JOptionPane.showMessageDialog(null,str,"Larger Number",JOptionPane.INFORMATION_MESSAGE);

}

}
 