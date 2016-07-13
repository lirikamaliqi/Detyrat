import javax.swing.*;
public class Detyra7_3_5_c
{ 
   public Detyra7_3_5_c()
   {}
   public long factorial(int i)
   { long faktoriel = -1; 
      if ( i >= 0 && i <= 20 )
      { int counter = 0; faktoriel = 1;
         while ( counter != i )
         
         { counter = counter + 1;
            faktoriel = faktoriel * counter;
         }
      }
      return faktoriel;
   }


   public static void main(String[] args)
   { Detyra7_3_5_c test=new Detyra7_3_5_c();
      String a = JOptionPane.showInputDialog("Shtyp nje numer ");
   
      System.out.println("Numri "+a+"! eshte " +test.factorial(new Integer(a).intValue()));
   }}
