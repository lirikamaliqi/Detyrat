import javax.swing.*;
public class Detyra7_3_5_a
{ 
   public Detyra7_3_5_a()
   {}
   public int sumation(int i)
   { int total = 0;
      int counter = 0; 
      while ( counter != i )
      { counter = counter + 1;
         total = total + counter;
      }
      return total;
   }

   public static void main(String[] args)
   { Detyra7_3_5_a test=new Detyra7_3_5_a();
      String a = JOptionPane.showInputDialog("Shtypni nje numer ");
   
      System.out.println("Per numrin "+a+", shuma eshte "+test.sumation(new Integer(a).intValue()));
   }}