import javax.swing.*;
import java.lang.*;
public class Detyra7_3_5_d_sin
{Detyra7_3_5_c fact= new Detyra7_3_5_c();
   public Detyra7_3_5_d_sin()
   {}
   
   public double sinus(double x)
   { double sin = x;
      int counter = 3;
      while ( counter <= 19 )
      { double m = Math.pow(x, counter)/fact.factorial(counter);
         if ( (counter % 4) == 3 )
         { sin = sin - m; }
         else { sin = sin + m; }
         counter = counter + 2;
      }
      return sin;
   }

   public static void main(String[] args)
   { Detyra7_3_5_d_sin test=new Detyra7_3_5_d_sin();
   String a = JOptionPane.showInputDialog("Type a number");
      System.out.println(test.sinus(new Double(a).doubleValue()));
   }
}