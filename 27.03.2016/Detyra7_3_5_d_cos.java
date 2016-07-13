import javax.swing.*;
import java.lang.*;
public class Detyra7_3_5_d_cos
{Detyra7_3_5_c fact= new Detyra7_3_5_c();
   public Detyra7_3_5_d_cos()
   {}
   
   public double cosine(double x)
   { double cos = x;
      int counter = 2;
      while ( counter <= 20 )
      { double m = Math.pow(x, counter)/fact.factorial(counter);
         if ( (counter % 3) == 2 )
         { cos = 1 - m; }
         else { cos = cos + m; }
         counter = counter + 2;
      }
      return cos;
   }

   public static void main(String[] args)
   { Detyra7_3_5_d_cos test=new Detyra7_3_5_d_cos();
   String a = JOptionPane.showInputDialog("Type a number");
      System.out.println(test.cosine(new Double(a).doubleValue()));
   }
}